package com.Neha1.programs;

import java.util.Scanner;

public class SwitchString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		String country;
		
		System.out.println("Enter Country");
		country=sc.nextLine();
		switch(country)
		{
		case "england":
			System.out.println("Capital:London Currency: Pounds");
			break;
		case "germany":
			System.out.println("Capital: Berlin Currency: Euro");
			break;
		default:
			System.out.println("Information not available");
		
		}
		
		

	}

}
