package com.neha.programs;

import java.util.Scanner;

public class StudentResult {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int marks = 0;

		try {

			marks = sc.nextInt();
			if (marks < 0 || marks > 100)

				throw new Exception();

		}

		catch (Exception e) {

			System.out.println("invalid input");
			marks = 0;
		}

		if (marks >= 35)
			System.out.println("pass");

		else

			System.out.println("Fail");
	}

}
