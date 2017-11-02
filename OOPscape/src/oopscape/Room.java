package oopscape;

import java.util.Scanner;

public class Room implements RoomStruct {

	static Scanner sc =new Scanner(System.in);
	String ch;
	String walls[] = {};
	String puzzle = "";
	int roomNo = 0;
	boolean open = false;
	boolean solved = false;
	String solutionToOpen = "";
	String name;
	String color;

	Room(String name, String walls[], String puzzle, boolean solved,
	 String solutionToOpen, String color,
			int roomNo) {
		this.color =  color;
		this.name=name;
//		this.connectsTo = connectsTo;
		this.walls = walls;
		this.puzzle = puzzle;
		this.solutionToOpen = solutionToOpen;
		this.solved = false;
		this.open = false;
		this.roomNo = roomNo;

	}

	

	@Override
	public void displayRoom() {
		System.out.println("welcome to room number "+this.roomNo);
		ch=this.sc.nextLine();
		System.out.println("hello! you're in the "+this.name);
		ch=this.sc.nextLine();
		System.out.println("the walls are painted "+this.color);
		String walls1[]={walls[0],walls[1]};
		String walls2[]={walls[3],walls[2]};
		ch=this.sc.nextLine();

		MultiThreading t1=new MultiThreading(walls[0],"wall 3:\n");
		t1.start();

		MultiThreading t2=new MultiThreading(walls[1],"wall 1:\n");
		t2.start();

		MultiThreading t4=new MultiThreading(walls[2],"wall 2:\n");
		t4.start();

		MultiThreading t3=new MultiThreading(walls[3],"wall 4:\n");
		t3.start();
//		System.out.println("\nwall 1:");
//		System.out.println(walls[0]+'\n');
//		System.out.println("wall 2:");
//		System.out.println(walls[1]+'\n');
//		System.out.println("wall 3:");
//		System.out.println(walls[2]+'\n');
//		System.out.println("wall 4:");
//		System.out.println(walls[3]+'\n');
		ch=this.sc.nextLine();
		System.out.println("\n\n"+this.puzzle);
		
	}
	void open(){
		this.open=true;
	}
	@Override
	public boolean checkAns() {
		String answer=sc.nextLine();
//		System.out.println(answer);
//		System.out.println(this.solutionToOpen);
		if(answer.equals(this.solutionToOpen)){
			this.solved=true;
		}
		return this.solved;
		
	}

//	@Override
//	public void displayHints() {
//
//
//	}

}
