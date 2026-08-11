package com.neha.programs;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {12,34,56,34,78,33,34,67};
		int temp;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		for(int n:arr) {
			System.out.println(n);
		}

	}

}
