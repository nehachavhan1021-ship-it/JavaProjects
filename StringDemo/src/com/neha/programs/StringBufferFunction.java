package com.neha.programs;

public class StringBufferFunction {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("technology");

		sb.append(" is your future");
		System.out.println(sb);
		sb.insert(11, "with ai ");
		System.out.println(sb);
		sb.delete(2, 5);
		System.out.println(sb);
		sb.deleteCharAt(2);
		System.out.println(sb);
		sb.replace(3, 4, "true");
		System.out.println(sb);
	}
}