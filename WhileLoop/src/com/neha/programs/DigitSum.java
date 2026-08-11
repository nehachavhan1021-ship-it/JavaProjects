package com.neha.programs;

import java.util.Scanner;

public class DigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n, remainder, sum = 0;
		System.out.print("enter a number :");
		n = sc.nextInt();
		while (n > 0) {
			remainder = n % 10;
			n /= 10;
			sum += remainder;
			
		}
		
		System.out.println(sum);
	}

}
