package com.neha.programs;

class ClassOne extends Thread {
	private String name;
	public ClassOne(String name){
		this.name=name;
		
		
	}
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(name+" "+i);
		}
	}

}


public class MultipleThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClassOne c=new ClassOne("priya");
ClassOne c1=new ClassOne("neha");

//c.run();
//c1.run();//this will print in order 
c.start();
c1.start();

	}

}
