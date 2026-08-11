package com.Neha1.programs;

import java.util.Scanner;

public class IfTernaryOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		String result=(age>=18)?"Adult":"minor";
		System.out.println(result);
		
		
		double pamt,disc;
		pamt=12000;
		disc=(pamt>2000)?pamt*13/100:pamt*9/100;
		System.out.println(disc);
		
		
		
		/*
		String status=(ps=="chelsea")?"success":"failed";
		System.out.println(status);
		*/
//		== compares whether two variables refer to the same object in memory.
//		.equals() compares whether the contents (characters) of the strings are the same.


		
		sc.close();
		

	}

}
