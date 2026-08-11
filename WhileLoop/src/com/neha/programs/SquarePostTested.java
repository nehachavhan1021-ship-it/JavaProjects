package com.neha.programs;

import java.util.Scanner;

public class SquarePostTested {

	public static void main(String[] args) {
		int n;
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		do {
		System.out.print("enter a number :");
		 n = sc.nextInt();
		if(n!=0) {
			
			System.out.println("square of number is :"+n*n);
		}
		
		}
		while(n!=0);
	}

}
