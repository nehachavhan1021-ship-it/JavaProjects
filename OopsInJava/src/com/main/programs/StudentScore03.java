package com.main.programs;

import com.neha.classes.*;

public class StudentScore03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student03 ob = new Student03();

		ob.setName("Priya");
		ob.setMarks(78);

		String name = ob.getName();
		int marks = ob.getMarks();
		System.out.println(name + " got " + marks + " marks in her sessional test ");

	}

}
