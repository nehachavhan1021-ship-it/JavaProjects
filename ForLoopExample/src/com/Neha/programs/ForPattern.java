package com.Neha.programs;

public class ForPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print(i + "*");
			}
			System.out.println();
		}

		// array is a collection of values of same type
		int[] n = { 9, 26, 13, 1, 10, 45, 30 };

		int i;
		for (i = 0; i <= 6; i++)
			System.out.println(n[i]);

		for (int x : n)
			System.out.println(x * x);

	}

}
