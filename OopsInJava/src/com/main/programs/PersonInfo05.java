package com.main.programs;

import com.neha.classes.Person05;

public class PersonInfo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person05 ob = new Person05();
		ob.setName("Neha");

		Person05 ob1 = new Person05("Priya");
		ob1.show();
		ob.show();
		Person05 ob2 = new Person05("Neha", "Chavhan");
		ob2.show();

	}

}
