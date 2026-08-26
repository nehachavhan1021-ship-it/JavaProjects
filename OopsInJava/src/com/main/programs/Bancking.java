package com.main.programs;

import com.neha.classes.ConstructorAccount;

public class Bancking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorAccount acc=new ConstructorAccount();
		acc.showAccountdetail();

		
		ConstructorAccount ob=new ConstructorAccount("SBI",233333.222);
		ob.showAccountdetail();
		
	}

}
