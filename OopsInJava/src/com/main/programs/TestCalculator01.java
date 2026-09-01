package com.main.programs;

import com.neha.classes.Calculator01;

public class TestCalculator01 {

	public static void main(String[] args) {

//		Calculator cl; //   declares a reference variable c of type Calculator. It does not create an object."
//		cl=new Calculator();  //instantiation of object

		Calculator01 cl = new Calculator01(); // Reference declaration + object creation
		cl.calcSquare(5);

		cl.add(3, 30);

//		cl.greet(); //is private
//		cl.result=23; //is private

	}

}
