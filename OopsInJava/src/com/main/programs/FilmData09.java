package com.main.programs;

import com.neha.classes.Film09;

public class FilmData09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Film09 ob = new Film09("sholey", 1975, "action", 8.1); // using parameterized constructor
		ob.showData();

		System.out.println(ob); // using toString() function

		ob = new Film09("3 idiot", 2009, "comedy", 8.4);
		System.out.println(ob);

	}

}
