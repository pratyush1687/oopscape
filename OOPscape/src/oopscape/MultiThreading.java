package oopscape;

import java.util.Random;

public class MultiThreading implements Runnable{
	private Thread t;
	private String arr;
	private int index;
	private String threadName;
	MultiThreading(String arr,String threadName){
		this.arr=arr;
		Random rand = new Random();
		this.index=rand.nextInt(6);
		this.threadName=threadName;
	}
	@Override
	public void run() {
		try{

			Thread.sleep(index*10);
				System.out.println(threadName);
				System.out.println(arr+"\n");
				
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void start(){
		if(t==null){
			t= new Thread(this,"thread1");
			t.start();
		}
	}

}
