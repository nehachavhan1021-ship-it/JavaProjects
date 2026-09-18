package com.neha.programs;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		int n, sq;

//		may produce two types of exception
		try {
			n = Integer.parseInt(args[0]);
			sq = n * n;
			System.out.println(sq);

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("enter something");
		} catch (NumberFormatException e) {

			System.out.println("enter valid input");
		}

	}

}
