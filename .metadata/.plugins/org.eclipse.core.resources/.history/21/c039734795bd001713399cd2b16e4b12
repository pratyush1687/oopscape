package oopscape;
import java.lang.*;

public class Player {
	String playerName;
	long startTime;
	long stopTime;
	long timeTaken;
	long penalty;
	int age;
	int currentRoom;

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

	void StopGame(){
		this.stopTime = System.currentTimeMillis();
		this.timeTaken = this.stopTime-this.startTime + penalty;
	}

	void writeToFile(){
		//function to write user data to file
	}
}
