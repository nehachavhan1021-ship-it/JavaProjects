package com.neha.programs;

public class CheckedException {
	
	public static void loadDBDriver() throws ClassNotFoundException{
		
		 Class.forName("com.mysql.cj.jdbc.Driver");
	}

	public static void main(String[] args) {
		
		try {
			
			loadDBDriver();
			
		}
		catch(Exception e) {
			
			
			System.out.println("Class not found");
		}
		
	}

}
