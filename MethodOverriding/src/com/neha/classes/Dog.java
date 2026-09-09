package com.neha.classes;

public class Dog extends Animal {
	public void sound() {
		super.sound();//Sometimes the child wants to execute the parent's version too.
		System.out.println("dog bark");
	}

}
