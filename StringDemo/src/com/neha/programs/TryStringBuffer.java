package com.neha.programs;

public class TryStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer  name=new StringBuffer("Neha");
		System.out.println(name.length());
		System.out.println(name.capacity());
		name.append(" Chavhan Group Team");
		System.out.println(name);
		
		System.out.println(name.length());
		System.out.println(name.capacity());

	}

}
