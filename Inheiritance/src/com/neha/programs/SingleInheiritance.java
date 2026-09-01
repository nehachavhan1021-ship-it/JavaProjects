package com.neha.programs;

public class SingleInheiritance {
//	In single inheritance, a sub-class is derived from only one super class.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Two2 obj=new Two2();
		obj.calcSq(5);
		obj.add(4, 6);

	}

}

//Base class,super class,parent class
class One1 {

	public void calcSq(int n) {

		int sq;
		sq = n * n;
		System.out.println(sq);
	}
}

//derived class,subclass,child class
class Two2 extends One1 {

	public void add(int a, int b) {

		int result = a + b;
		System.out.println(result);
	}
}
