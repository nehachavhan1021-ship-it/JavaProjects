package com.neha.classes;

import java.io.Serializable;

public class Employee implements Serializable {
	private int empId;
	private String name;
	private String location;
	private String department;
	private String post;
	private double salary;
	public Employee(int empId, String name, String location, String department, String post, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.location = location;
		this.department = department;
		this.post = post;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", location=" + location + ", department=" + department
				+ ", post=" + post + ", salary=" + salary + "]";
	}
	

}
