package com.neha.programs;

import java.util.*;

public class TestError {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("enter number :");
		int number;

		try {
			number = in.nextInt();

			System.out.println(number);
		}

		catch (InputMismatchException e) {

			System.out.println("Invalid input :enter number ");
		}

	}

}
