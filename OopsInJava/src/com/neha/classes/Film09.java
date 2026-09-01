package com.neha.classes;

public class Film09 {

	private String filmname;
	private int year;
	private String genre;
	private double imdbrating;
	
	//their are two ways to assign value to our data members  1.parameterized constructor 2.toString() function
	

	public Film09(String filmname, int year, String genre, double imdbrating) {

		this.filmname = filmname;
		this.year = year;
		this.genre = genre;
		this.imdbrating = imdbrating;
	}

	public void showData() {

		System.out.println("film name is :" + filmname);
		System.out.println("release year: " + year);
		System.out.println("genre: " + genre);
		System.out.println("imdbrating is: " + imdbrating);
	}

	@Override
	public String toString() { // using this we can print class
		return "Film [filmname=" + filmname + ", year=" + year + ", genre=" + genre + ", imdbrating=" + imdbrating
				+ "]";
	}

}
