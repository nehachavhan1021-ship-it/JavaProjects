package com.neha.programs;

import com.neha.classes.Movies;

public class MovieInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Movies ob;
	ob=new Movies("PK", "comedy","amir khan",  2014, 8.9);
		System.out.println(ob);
		
ob=new Movies("Sholay","amjad khan", "action",  1975, 8.1);
System.out.println(ob);
	}

}
