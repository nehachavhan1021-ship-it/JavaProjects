package com.neha.classes;

public class Calculator01 {

	// data members
	// data member should be private //we can not use them in different methods in same class
	 

	private int result;

	// function members (methods)
	// maximum time it should be public // we can use them in different package

	private void greet() {
// use of private methods
//		Code Reusability
//		Encapsulation & Abstraction:
//		Maintainability: Breaking large, messy methods into smaller private blocks
//		Security & Control
		System.out.println("Wellcome");

	}

	public void calcSquare(int n) {

		greet();

		result = n * n;
		;
		System.out.println(result);
	}

	public void add(int a, int b) {

		result = a + b;
		System.out.println(result);

//		System.out.println(n); //not allowed

	}

}
