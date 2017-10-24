package oopscape;

public class Room {
	Room connectsTo;
	String walls[];
	String puzzle;
	int roomNo;
	int puzzleNo;
	boolean open;
	boolean solved;
	String solutionToOpen;
	
	Room(Room connectsTo,String walls[],String puzzle,
			int puzzleNo,boolean solved,String solutionToOpen,int roomNo){
		
		this.connectsTo = connectsTo;
		this.walls = walls;
		this.puzzle = puzzle;
		this.solutionToOpen = solutionToOpen;
		this.solved = false;
		this.open = false;
		this.roomNo = roomNo;
		this.puzzleNo = puzzleNo;
	}
	
	void displayRoom(){
//		print the contents of the room if room == open;
		
//		else give an error		
	}
	
	void inputAnswer(String answer){
		if(answer == this.solutionToOpen){
			this.solved = true;
		}
	}
}
