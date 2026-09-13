package com.neha.programs;

class Massage implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Massage thread running...");
	}
	
}

public class ImplementsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Massage m=new Massage();
		Thread t=new Thread(m);
		t.start();

	}

}
