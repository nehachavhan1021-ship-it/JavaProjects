package com.neha.programs;

public class StringEquality_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "neha";
		String username = "neha";
//		String object created in the String Pool
//		Reuses an existing pooled string if available
		System.out.println(name == username);

		String city = new String("London");
		String location = new String("London");
//		Creates a new String object on the heap
//		Can use more memory
		System.out.println(city == location);
//		equals() compares the actual String content, while == compares the references.
		System.out.println(city.equals(location));

	}

}
