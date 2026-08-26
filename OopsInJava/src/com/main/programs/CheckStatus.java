package com.main.programs;

import java.util.Scanner;

import com.neha.classes.User;

public class CheckStatus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter userid");
		String ui=sc.next();
		System.out.println("enter password");
		String ps=sc.next();
		
		User ob=new User();
		ob.setUserId(ui);
		ob.setPassword(ps);
		
//	System.out.println(ob.getStatus());	
		
		if(ob.getStatus().equals("success"))
			System.out.println("welcome to java ");
		
		else
			System.out.println("sorry, authentication failed");

	}

}
