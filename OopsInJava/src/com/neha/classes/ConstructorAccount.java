package com.neha.classes;

public class ConstructorAccount {

	private String name;
	private double balance;

	public ConstructorAccount() {
		//have same name as class
		//use to assign initial value to data member
		//automatically runs whenewer object of that class  is created 
		//without return type  
		
		name = "unknown";
		balance = 0.00;
		System.out.println("Constructor executed...");

	}
	
public ConstructorAccount(String name,double balance) {
	
	this.name="Neha";
	this.balance=3444.333;
	System.out.println("parameterized constructor executed..");
}

public void showAccountdetail() {
	
	System.out.println(" Account name is :" +name);
	System.out.println("balance is :"+balance);
}




}
