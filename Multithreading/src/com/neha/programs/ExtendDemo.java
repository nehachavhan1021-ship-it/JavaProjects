package com.neha.programs;


 class Neha extends Thread{
	public void run() {
		System.out.println("Neha thread is running");
	}

	

}

public class ExtendDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Neha n=new Neha();
		n.start();
	}

}

