package com.neha.programs;
class Aarya extends Thread{
	
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			
			
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
			
		
	}
}

public class TimeWaitingThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aarya a=new Aarya();
		a.start();

	}

}
