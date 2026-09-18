package com.neha.programs;

import java.util.*;

public class TryLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//use when we want fast Fast Manipulations: Inserting or deleting elements does not require 
//		shifting elements, making these operations faster than in an ArrayList
//		Not Thread-Safe: By default, LinkedList is not synchronized.
		LinkedList<String> list=new LinkedList<>();
//		Dynamic Sizing: It automatically grows and shrinks as elements are added or removed.
		list.add("english");
		list.add("urdu");
		list.add("hindi");
		list.add("marathi");
		list.add(null); //Duplicates & Nulls allows 
		list.add("english");
		System.out.println(list);
	}

}
