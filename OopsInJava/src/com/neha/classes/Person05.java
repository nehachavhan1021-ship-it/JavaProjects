
package com.neha.classes;

public class Person05 {

	private String name;

	public Person05() {

		name = "no name";

		System.out.println("empty constructor");
	}

	public Person05(String name) {

		this.name = name;
		System.out.println("parameterize constructor");

	}

	public Person05(String Fname, String Lname) {
		name = Fname + " " + Lname;
		System.out.println("double parameterize constructor");

	}

	public void setName(String name) {
		this.name = name;
	}

	public void show() {

		System.out.println("Name is :" + name);
	}

}
