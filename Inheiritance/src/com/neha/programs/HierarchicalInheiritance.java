package com.neha.programs;

public class HierarchicalInheiritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Third ob = new Third();
		ob.calcDiscount(5);
		ob.calcSquare(5);
//ob.add(4,5);   cant inheirite properties of siblings

	}

}

class First {
	public void calcSquare(int n) {
		int sq;
		sq = n * n;
		System.out.println("Square is " + sq);
	}
}

class Second extends First {
	public void add(int a, int b) {
		int res;
		res = a + b;
		System.out.println("Sum is " + res);
	}
}

class Third extends First {
	public void calcDiscount(double amount) {
		double disc = amount * 9 / 100;
		System.out.println("Discount will be " + disc);
	}
}
