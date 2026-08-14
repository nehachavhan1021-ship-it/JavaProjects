package com.neha.programs;

import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StringTokenizer st=new StringTokenizer("i love programming in java");
		
		while(st.hasMoreTokens()) {
		String token =st.nextToken();
			System.out.println(token);
		}

	}

}
