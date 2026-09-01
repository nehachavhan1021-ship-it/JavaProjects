package com.neha.classes;

public class Discount07 {

	private double discount;

	public Discount07() {
		discount = 9;
	}

	public void calcDiscount(String cname, double amount) {

		double discountamt, totalbill;

		discountamt = amount * discount / 100;
		totalbill =Math.floor(amount - discountamt) ;
		System.out.println("costomer name is :" + cname);
		System.out.println("discount:" + discount);
		System.out.println("total amount in ruppes:" + amount + " ₹");
		System.out.println("amount after discount :" + discountamt);
		System.out.println("total bill : " + totalbill);

	}

	

}
