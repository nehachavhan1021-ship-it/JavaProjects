package com.neha.programs;

import java.util.StringTokenizer;

public class CommaSaperatedValueTokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Neha,Chavhan,20,BE,2nd year,linkedIn";
		StringTokenizer st1 = new StringTokenizer(str, ",");

		StringTokenizer st = new StringTokenizer("To Good To Be True");

		while (st.hasMoreTokens()) {

			System.out.println(st.nextToken());
		}

		System.out.println("----------");
		while (st1.hasMoreTokens()) {

			System.out.println(st1.nextToken());
		}

	}

}
