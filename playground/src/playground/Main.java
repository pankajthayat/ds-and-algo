package playground;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {
	
		
		Demo d = new Demo();
		d.start();
		for(int i=0;i<5;i++)
			System.out.println(i+" : "+"main");
		
	}
}



class Demo extends Thread{
	
	@Override
	public synchronized void start() {
		super.start();
		System.out.println("demo start");
	}
	@Override
	public void run() {
	for(int i=0;i<5;i++)
		System.out.println(i+" : demo");
	}
}
