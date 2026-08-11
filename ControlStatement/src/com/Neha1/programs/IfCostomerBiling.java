package com.Neha1.programs;

import java.util.*;
public class IfCostomerBiling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);

		int amount,bill,discount;
		String name;
		System.out.println("Enter costomer name:");
		name=sc.nextLine();
		System.out.println("Enter amount:");
		amount=sc.nextInt();
		
		if(amount>20000) {
			discount=amount*13/100;
			System.out.println("13 % discount applied");
		}
		else {
			discount=amount*9/100;
			System.out.println("9 % discount applied");
		}
		bill=amount-discount;
		System.out.println(name);
		System.out.println(amount);
		System.out.println(discount);
		System.out.println(bill);
		
	}

}
