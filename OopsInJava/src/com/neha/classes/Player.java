package com.neha.classes;

public class Player {

	private String name;
	private int age;

	public void setName(String name) {

//name=name;  //pointing to the data member ,so it gives Null value.

		this.name = name; // 'this.name' refers to the instance variable /data member / to eliminate
							// naming conflicts

	}
	
	// To assign value -> set
	// To retrieve value -> get

	public String getName() {
		return name;
	}
	
	public void setAge(int a) {
		age=a;
	}

	public int getAge() {
		return age;
	}

	

}
