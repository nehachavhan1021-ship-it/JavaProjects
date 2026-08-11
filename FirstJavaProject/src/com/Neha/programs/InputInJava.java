package com.Neha.programs;

import java.util.*;

public class InputInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str;
		
		double num1,num2,result;
		int a,b,c;
		
//		for Integer 
		System.out.print("Enter first number:");
		a=sc.nextInt();
		System.out.print("Enter Second number:");
		
		b=sc.nextInt();
		c=a+b;
		System.out.println("Sum of a and b is: "+c);
		
//		for double 
		System.out.println("Enter num1 :");
		num1=sc.nextDouble();
		System.out.println("Enter num2 :");
		
	    num2=sc.nextDouble();
	    result=num1*num2;
	    System.out.println(" your answer is :"+result);
//	   	for String
	  
	    System.out.print("please enter your name:");
	
	   str=sc.nextLine();
	  System.out.println("have a good day "+str);
	 
		
		sc.close();

	}

}
