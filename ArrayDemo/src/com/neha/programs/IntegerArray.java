package com.neha.programs;

public class IntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[5];
		
		/*
		arr[0]=9;
		arr[1]=13;
		arr[2]=1;
		arr[3]=26;
		arr[4]=30;
		*/
		int [] b= {12,23,45,65,67};
//		System.out.println(b.length);
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
			
			
		}
		System.out.println("------");
		
		for(int n:b) {
			System.out.println(n);
		}
		
		System.out.println("------");
		
		int sum=0;
		for(int n:b) {
			
			 sum+=n;
			
		}
		 System.out.println(sum);
		
		
	}

}
