package com.neha.programs;

public class StringMoreFunction03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Neha";
		String userid="neha";
		System.out.println(name.equals(userid));
		System.out.println(name.equalsIgnoreCase(userid));
		
		if(name.equalsIgnoreCase(userid))
			System.out.println("same name and userid not allowed");
		
		String name1="Arya";
		String name2="arya";
		System.out.println(name1.compareTo(name2));  //-ve if first is smaller
		System.out.println(name2.compareTo(name1)); //+ve if first is larger
		System.out.println(name1.compareTo(name1));  //0 if same
		System.out.println(name1.compareTo("riya"));
		
		
		

	}

}
