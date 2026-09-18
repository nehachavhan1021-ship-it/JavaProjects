package com.neha.programs;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		The LinkedList class is a collection which can contain many objects of the same type, just like the ArrayList.
//		Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.
LinkedList<String> cars=new LinkedList<>();

cars.add("Volvo");
cars.add("BMW");
cars.add("Ford");
cars.add("Mazda");
System.out.println(cars);
cars.getFirst();
		
		
	}

}
