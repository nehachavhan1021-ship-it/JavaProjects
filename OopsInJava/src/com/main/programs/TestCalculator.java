package com.main.programs;

import com.neha.classes.Calculator;

public class TestCalculator {

	public static void main(String[] args) {
		
//		Calculator cl; //   declares a reference variable c of type Calculator. It does not create an object."
//		cl=new Calculator();  //instantiation of object
		
		Calculator cl=new Calculator(); //Reference declaration + object creation
		cl.calcSquare(5);
		
		cl.add(3, 30);
		
//		cl.greet(); //is private
//		cl.result=23; //is private
		

		

	}

}
