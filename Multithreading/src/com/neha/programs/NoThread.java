package com.neha.programs;

class Numbers{
	
	void run() {
	for(int i=1;i<=10;i++) {
		System.out.println(i);
	}
	}
}

public class NoThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Numbers n=new Numbers();
n.run();
Numbers n1=new Numbers();
n1.run();
	}

}
