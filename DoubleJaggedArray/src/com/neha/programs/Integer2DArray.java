package com.neha.programs;

import java.util.Scanner;

public class Integer2DArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int[][] arr = new int[4][5];
//		arr[0][0]=23;
//		arr[0][1]=23;
//		arr[0][2]=245;
//		arr[0][3]=233;
//		arr[1][0]=243;
//		arr[1][1]=253;
//		arr[1][2]=23;

		int[][] arr1 = { { 12, 21, 23, 23 }, { 12, 23, 34, 45 }, { 12, 12, 45, 65 }, { 23, 23, 12, 45 } };
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 4; j++) {
//				System.out.println(arr1[i][j]);
//			}
//		}

//		System.out.println("enter number");
//		
//		for (int i=0;i<=3;i++) {
//			
//			for(int j=0;j<=4;j++) {
//				arr[i][j]=sc.nextInt();
//				
//			}

//		}
		System.out.println("array completed");

		for (int i = 0; i < arr1.length; i++) {
			int res = 0;
			for (int j = 0; j < arr1[i].length; j++) {
				res +=arr1[i][j];

			}
			System.out.println(res);
		}

	}

}
