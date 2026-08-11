package com.neha.programs;

public class LargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] b= {12,23,45,65,67};
		int largest=0;
		for(int i=0;i<b.length;i++) {
			
			if(b[i]>largest) {
				largest=b[i];
			}
			
		}
		System.out.println(largest);
		
		
		
	}

}
