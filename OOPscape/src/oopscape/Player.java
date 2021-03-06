package oopscape;
import java.lang.*;
import java.io.*;

public class Player implements Serializable,Comparable{
	String playerName;
	long startTime;
	long stopTime;
	long timeTaken;
	long penalty;
	int age;
	int currentRoom;
	int score=0;

	Player(String playerName,int age){
		this.playerName = playerName;
		this.age = age;
		this.penalty = 0;
		this.currentRoom = 1;
	}

	void StartGame(){
		this.startTime = System.currentTimeMillis();
	}

	void penalise(long penalty){
		this.penalty+=penalty;
	}

	void stopGame(){
		this.stopTime = System.currentTimeMillis();
		this.timeTaken = this.stopTime-this.startTime + penalty;
		System.out.println(this.timeTaken);
//		this.writeToFile();
	}

	void increaseScore(int score){
		this.score+=score;
	}
	

	public void welcome() {
		// TODO Auto-generated method stub
		System.out.println("Welcome "+this.playerName+" you have been here for "+this.age+" years"
				+ "\nand now its time that you serve your country");
	}

	

	@Override
	public int compareTo(Object p2) {
		// TODO Auto-generated method stub
		if(this.score==((Player)p2).score){
			return (int) (this.timeTaken-((Player) p2).timeTaken);
		}
		return (int) (((Player) p2).score-this.score);
	}
}
