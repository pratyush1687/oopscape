package oopscape;

public class MasterRoom extends Room {

	String food;
	MasterRoom(String name, Room connectsTo, String walls[], String puzzle, boolean solved, String solutionToOpen,
			int roomNo,String food) {


		super(name, connectsTo, walls, puzzle, solved, solutionToOpen, roomNo);
        this.food=food;

	}

}
