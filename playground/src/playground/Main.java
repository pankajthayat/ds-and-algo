package playground;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		
		Demo d = new Demo();
		Thread t = new Thread(d);
		t.setName("Demo");
		t.start();
		Thread.currentThread().setName("main");
//		t.join();
		t.wait();
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+" :  "+i);
			Thread.currentThread().sleep(500);
		}

		
	}
}


class Demo implements Runnable{
	@Override
	public void run() {
	
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"  :  "+i);
		}
		
	}
}