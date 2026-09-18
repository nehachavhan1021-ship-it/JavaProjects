package com.aarya.interfaces;

//it is the core mechanism used to achieve total abstraction multiple inheiritance
//collection of abstract methods 
public interface Automobile {

	// abstract function
	public void start();

	public void stop();

	public void changeSpeed();

	public void turn();

//Default methods are methods within a Java interface that include a met
	default void showMassage() {
		System.out.println("stay safe");
	}

}
