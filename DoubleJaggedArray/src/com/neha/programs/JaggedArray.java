package com.neha.programs;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]= {
				{12,34,},
				{12,4,44,22,11},
				{12,1},
				{12,44,78}
		
		};
		
		for(int i=0;i<=arr.length-1;i++) {
			for (int j=0;j<=arr[i].length-1;j++) {
				System.out.println(arr[i][j]);
			}
		}
	}

}
