package oopscape;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Game {

	static Player player1;
	static ArrayList<Player> leaders=new ArrayList(); 
	static Scanner sc = new Scanner(System.in);
	Room r1, r2, r3, r4, r5, mr;
	static Room currentRoom;

	Game(Player player1, Room r1, Room r2, Room r3, Room r4, Room r5, MasterRoom mr) {
		this.player1 = player1;
		this.r1 = r1;
		this.r2 = r2;	
		this.r3 = r3;
		this.r4 = r4;
		this.r5 = r5;
		this.mr = mr;
		currentRoom = r1;
//		for(int i=0;i<10;i++){
//			leaders.add(new Player("",0));
			
//		}
		try {
	         FileInputStream fileIn = new FileInputStream("leaderBoard.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         leaders = (ArrayList) in.readObject();
//	         System.out.println("ajdnscbs");
	         in.close();
	         fileIn.close();
	      } catch (IOException e) {
	    	  if(leaders.size()<=0){
	    		  System.out.println("leader board is empty");
	    	  }
//	    	  for(int i=0;i<10;i++){
//	  			leanew Player("",0));
	         
	  		
	      } catch (ClassNotFoundException c) {
	         System.out.println("Employee class not found");
	         c.printStackTrace();
	      }	
//		System.out.println(leaders.get(leaders.size()-1).timeTaken);
	      
	}
	
	void writeLeaderBoard(){
		try {
	         FileOutputStream fileOut =
	         new FileOutputStream("./leaderBoard.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(this.leaders);
	         out.close();
	         fileOut.close();
//	         System.out.printf("Serialized data is saved in leaderboard.ser");
	      } catch (IOException i) {
	         i.printStackTrace();
	      }
	}
	
	static boolean playroom(Room nextRoom) {
		clscr();
		int no_of_tries = 3;
		currentRoom.displayRoom();
		while (no_of_tries > 0) {
			System.out.println("no of tries left:" + no_of_tries);
			if (currentRoom.checkAns()) {
				currentRoom = nextRoom;
//				player1.score+=10000;
				return true;
			} else {
				no_of_tries -= 1;
				player1.penalise(10000);
			}
		}
		System.out.println("sorry you have been caught by the king's gaurds");
		return false;
	}

	public static void clscr() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
	void endGame(int score){
		this.player1.stopGame();
		this.player1.increaseScore(score);
		if(leaders.size()<10){
			leaders.add(this.player1);
		}
		else if (this.player1.score*1.0/this.player1.timeTaken>=leaders.get(leaders.size()-1).score*1.0/leaders.get(leaders.size()-1).timeTaken){
			leaders.set(leaders.size()-1, this.player1);
		}
		Collections.sort(leaders);
		writeLeaderBoard();
		System.exit(0);
	}
	
	public void start() {
		if (!playroom(r2)) {
			endGame(1000);
		}
		;
		if (!playroom(r3)) {
			endGame(3000);
		}
		;
		if (!playroom(r4)) {
			endGame(4000);
		}
		;
		if (!playroom(r5)) {
			endGame(5000);
		};
		if(!playroom(null)){
			endGame(6000);
		}
//		if(!playroom(null)){
//			endGame(7000);
//		}
	}

	public void showLeaderBoard() {
		// TODO Auto-generated method stub
		
	}

}
