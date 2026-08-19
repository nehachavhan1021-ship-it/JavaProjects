package com.neha.programs;

public class LogicalError {

	public static void main(String[] args) {
//		Logical errors occur when the program compiles and runs successfully but produces incorrect output.
//		Occur due to wrong conditions, formulas, or operators used in code.
		int rem=0;
		int num=534;
		while(num>=0) {
			rem=num%10;
			
			num=num/10;
			
		}
		System.out.println(rem);

	}

}
