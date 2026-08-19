package com.neha.programs;

import java.util.Scanner;

public class RunTimeErrors {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		Runtime errors occur during the execution of a program after successful compilation.
//		May cause the program to terminate abruptly
//		Can be handled using exception handling (try-catch blocks).

//		ArithmeticException error

//		int num1 = 12;
//		int num2 = 0;
//		try {
//
		//// cannot divide by zero
//			int div = num1 / num2;
//
//			System.out.println(div);
//
//		} catch (ArithmeticException e) {
//
//			System.out.println("cannot divide by zero");
//		}

		// ArrayIndexOutOfBoundsException error
		String nm;
		try {
			nm = args[0];

		} catch (ArrayIndexOutOfBoundsException e) {

			nm = "Neha";
			System.out.println("You can send your name from the command line");
		}
		System.out.println("Welcome " + nm + " to Java");

		// Class cast error

		Object obj = "Make it work";
		try {
			int line = (Integer) obj;

		} catch (ClassCastException e) {

			System.out.println("casting error");
		}
		
//		NullPointerException
		String n=null;
		try {
		System.out.println(n.length());
		}catch(NullPointerException e) {
			
			//System.out.println(e);
	        //System.out.println(e.getMessage());
			System.out.println("cant calculate length of null object");
		}
		
		
		

	}

}
