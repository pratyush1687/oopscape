package oopscape;

import java.io.InputStream;
import java.util.Scanner;

public class Game {

	static Player player1;
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
	}
	
	static boolean playroom(Room nextRoom) {
		clscr();
		int no_of_tries = 3;
		currentRoom.displayRoom();
		while (no_of_tries > 0) {
			System.out.println("no of tries left:" + no_of_tries);
			if (currentRoom.checkAns()) {
				currentRoom = nextRoom;
				player1.score+=10000;
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

	public void start() {
		if (!playroom(r2)) {
			this.player1.stopGame();
			System.exit(0);
		}
		;
		if (!playroom(r3)) {
			this.player1.stopGame();
			System.exit(0);
		}
		;
		if (!playroom(r4)) {
			this.player1.stopGame();
			System.exit(0);
		}
		;
		if (!playroom(r5)) {
			this.player1.stopGame();
			System.exit(0);
		};
		this.player1.stopGame();
	}

}
