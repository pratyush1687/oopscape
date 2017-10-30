package oopscape;

import java.util.Scanner;

public class CreateEnvironment {

	static Scanner in = new Scanner(System.in);
	static Player player1;
	static Room r1,r2,r3,r4,r5;
	static MasterRoom mr;
	/*
	 * this class will determine the flow of the game and will contain the main
	 * display functions
	 * 
	 * for a basic flow of the game :
	 * 
	 * ----- open connection ______ or | have to pass through a lock to open
	 * 
	 * open connections will only work if the room has been opened if a room is
	 * closed and you try to access it via open connection you'll be sent back
	 * 
	 * 
	 * room 1 -------------------------------------- room 2 | | | | lock lock |
	 * | | | room3-------open only if both rooms open------room4 | | | lock | |
	 * | room5 | | | lock | | Master Room
	 */

	// TODO: formulate and divide puzzles
	// TODO: make a design for displaying layout and rooms

	private static void initializePlayer() {

		System.out.println("Enter your name :");
		String name = in.nextLine();
		System.out.println("Enter your age");
		int age = in.nextInt();

		player1 = new Player(name, age);

	}

	public static void main(String[] args) {

		char ch;

		createRoom();
		System.out.println(
				"Welcome to the King's palace. This is the year 1867. You are now landing in the rein of Tipu Sultan, the King.\n"
						+ " The Great Queen Victoria has assiged you a mission.\n"
						+ "Your mission if you chose to accept it is to enter the highly secure palace of Tipu Sultan"
						+ "and steal his GREAT GOLD SWORD\n");
		System.out.println("Do you wish to play? (y/n) : ");
		ch = in.next().charAt(0);

		if (ch == 'n' || ch == 'N')
			System.exit(0);

		initializePlayer();
		player1.StartGame();
		Game gotogame=new Game(player1,r1,r2,r3,r4,r5,mr);
		

	}

	private static void createRoom() {
		
		r1=new Room();
		
	}


}
