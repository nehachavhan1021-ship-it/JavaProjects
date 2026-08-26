package com.main.programs;

import com.neha.classes.*;

public class StudentScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student ob = new Student();

		ob.setName("Priya");
		ob.setMarks(78);

		String name = ob.getName();
		int marks = ob.getMarks();
		System.out.println(name + " got " + marks + " marks in her sessional test ");

	}

}
