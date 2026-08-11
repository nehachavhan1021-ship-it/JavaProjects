package com.neha.programs;

import java.util.Scanner;

public class WhileSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = 2;

		while (n != 0) { // repeat as long as the condition is true
			// pre-tested loop (condition first then action)

			System.out.print("enter a number :");
			n = sc.nextInt();

			if (n != 0) {
				System.out.println("square is : " + n * n);
			}

		}

	}

}
