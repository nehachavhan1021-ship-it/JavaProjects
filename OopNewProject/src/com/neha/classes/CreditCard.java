package com.neha.classes;

import com.aarya.interfaces.Payment;

public class CreditCard implements Payment {

	@Override
	public void pay() {
		System.out.println("credit card payment done");
	}

	@Override
	public void refund() {
		System.out.println("credit card payment refund complete");
	}

	
}
