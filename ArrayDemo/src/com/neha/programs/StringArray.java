package com.neha.programs;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String[] s= {"neha","priya","shilpa"};
		
//		System.out.println(s[1]);
		
		for(String nm:s) {
			System.out.println(nm+" ");
		}
		
		String str[]=new String[5];
		System.out.println("enter five names");
		for(int i=0;i<str.length;i++)
		
		str[i]=sc.next();
		
		

	}
	

}
