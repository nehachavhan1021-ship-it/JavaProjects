package com.neha.programs;

public class TryStringBuilder {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb=new StringBuilder("hello");
		
		System.out.println(sb.append(" world"));
		System.out.println(sb.insert(5, " in the java"));
		
		
		
		
	
		System.out.println(sb.replace(0, 4, "welcome"));
		System.out.println(sb.delete(2, 3));
		System.out.println(sb.deleteCharAt(4));
		System.out.println(sb.reverse());
		
		
		

	}

}
