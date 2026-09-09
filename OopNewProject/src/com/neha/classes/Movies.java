package com.neha.classes;

public class Movies {
	private String name;
	private String genre;
	private String actor;
	private int year;
	private double rating;
	public Movies(String name, String genre,String actor, int year, double rating) {
		super(); //by default  
		this.name = name;
		this.genre = genre;
		this.year = year;
		this.rating = rating;
		this.actor=actor;
	}
	@Override
	public String toString() {
		return "Movies [name=" + name + ", genre=" + genre + ", actor=" + actor + ", year=" + year + ", rating="
				+ rating + "]";
	}
	
	
	
	
	

}
