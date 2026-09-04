package com.neha.classes;

public class ClassTwo extends ClassOne {

	public ClassTwo() {
		System.out.println("derived class:empty constructor");
	}

	public ClassTwo(String name) {

		super(name);
//		super();// if before :first call base class constructor

		System.out.println("derived class:paramiterized constructor" + name);
		// if after :first call derived class
	}

}
