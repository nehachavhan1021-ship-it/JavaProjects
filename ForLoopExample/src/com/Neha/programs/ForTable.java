package com.Neha.programs;

import java.util.Scanner;

public class ForTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number:");
		int n = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
		}
		sc.close();

	}

}
