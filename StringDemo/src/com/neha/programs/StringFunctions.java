package com.neha.programs;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nm = "try Again try but do not cry";
		System.out.println(nm.length());
		System.out.println(nm.charAt(0));
		System.out.println(nm.substring(0, 2));
		System.out.println(nm.substring(5));
		System.out.println(nm.toUpperCase());
		System.out.println(nm.toLowerCase());
		String city = "     Washim    ";

		System.out.println("my city is " + city.trim() + " and i love it");
		System.out.println("my city is " + city.strip() + " and i love it");
		System.out.println("my city is " + city.stripLeading() + " and i love it");
		System.out.println("my city is " + city.stripTrailing() + " and i love it");

		String line = "technology is power";
		System.out.println(line.startsWith("tech"));
		System.out.println(line.startsWith("power", 14));
		System.out.println(line.endsWith("po"));
		System.out.println(line.contains("is"));
		System.out.println(line.contains("was"));
		System.out.println(line.indexOf("is")); // -1 if index not found

	}

}
