package com.neha.programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Collection Framework → works with objects → primitives use wrapper classes automatically through autoboxing.

public class Main {

//	ArrayList - like a resizable array with fast random access
//	It is part of the java.util package and implements the List interface.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<String> cars=new ArrayList<>(); 
		
		
//		I want to use the List interface, and the actual list object will be an ArrayList.
		List <String> cars=new ArrayList<>();
		
		cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    
	    System.out.println(cars);
	    cars.add(3, "Fararri");
	    System.out.println(cars);
	    System.out.println(cars.size());
	    System.out.println(cars.remove(0));
	    // Get the first element
//	    cars.clear();
	    System.out.println(cars.get(0));
	    //
	    System.out.println(cars.set(2,"tata"));
	    System.out.println(cars);
	    //method one
//	    for (int i = 0; i < cars.size(); i++) {
//	        System.out.println(cars.get(i));
//	    }
	    //method second
//	    for (String c:cars)
//	    	System.out.println(c);
	    
	    
	   // method third
	    Iterator<String> it=cars.iterator();
	    while(it.hasNext()) {
	    	System.out.println(it.next());
	    }
	    
		
		
	}

}
