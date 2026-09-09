package com.neha.classes;

import com.aarya.interfaces.Automobile;

public class Gwagon implements Automobile{

	@Override
	public void start() {
		System.out.println("Gwagon started");
		
	}

	@Override
	public void stop() {
		System.out.println("Gwagon Stop");
		
	}

	@Override
	public void changeSpeed() {
		System.out.println("Gwagon change speed");
		
	}

	@Override
	public void turn() {
		System.out.println("Gwagon turn");
		
	}

}
