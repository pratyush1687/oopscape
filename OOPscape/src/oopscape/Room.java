package oopscape;

public class Room implements RoomStruct {

	String walls[] = {};
	String puzzle = "";
	int roomNo = 0;
	boolean open = false;
	boolean solved = false;
	String solutionToOpen = "";
	Room connectsTo;
	String name;

	Room(String name,Room connectsTo, String walls[], String puzzle, boolean solved, String solutionToOpen,
			int roomNo) {

		this.name=name;
		this.connectsTo = connectsTo;
		this.walls = walls;
		this.puzzle = puzzle;
		this.solutionToOpen = solutionToOpen;
		this.solved = false;
		this.open = false;
		this.roomNo = roomNo;
	
	}

	@Override
	public void displayRoom() {
		
	}

	@Override
	public void checkAns(String answer) {
		

	}

//	@Override
//	public void displayHints() {
//		
//		
//	}

}
