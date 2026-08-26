package com.neha.programs;

import java.util.Scanner;

public class AmountDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		double Amount, Discount, TotalBill;
		System.out.println("please enter amount");

		try {

			Amount = sc.nextDouble();

		} catch (Exception e) {

			System.out.println("invalid Amount");
			Amount = 0;

		}

		Discount = Amount * 10 / 100;

		TotalBill = Amount - Discount;
		if (Amount > 0) {

			System.out.println("Total amount :" + Amount);
			System.out.println("tatal discount :" + Discount);
			System.out.println("Totalbill :" + TotalBill);
		}

	}

}
