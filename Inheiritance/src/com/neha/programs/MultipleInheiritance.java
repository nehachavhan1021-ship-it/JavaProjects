package com.neha.programs;

public class MultipleInheiritance {

	// in multiple inheiritance a class can inheirit from more than one parent class
	// Multiple inheritance is not allowed with classes in Java
//	it can cause ambiguity when multiple parents have the same methods

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Two ob = new Two();
		ob.add(3, 5);
		ob.calcSq(5);

	}

}

//First Parent Class
class One {

	public void calcSq(int n) {

		int sq;
		sq = n * n;
		System.out.println(sq);
	}
}

//Second Parent Class
class Two {

	public void add(int a, int b) {

		int result = a + b;
		System.out.println(result);
	}
}

//Inheriting Properties of
//Parent1 and Parent2
class Three extends Two,One 
{

	public void calcDiscount(int amount) {

		int discountAmt = amount * 9 / 100;

		System.out.println(discountAmt);

	}
}
