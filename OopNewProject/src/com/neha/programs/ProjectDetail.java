package com.neha.programs;

import com.neha.classes.StudentProject;

public class ProjectDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentProject obj1 = new StudentProject("Death prediction system", "python", "mongodb", 5);
		System.out.println(obj1);

		StudentProject obj = new StudentProject();
		obj.setProjectname("Student Management System");
		obj.setLanguage("java");
		obj.setDatabase("MongoDb");
		obj.setMember(4);

		System.out.println(obj.getProjectname());
		System.out.println(obj.getLanguage());
		System.out.println(obj.getDatabase());
		System.out.println(obj.getMember());
		
		
		
	}

}
