package com.neha.classes;

public class StaticVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s = new Students();

		s.show("neha", 56);
		Students s1 = new Students(); /*
										 * A static variable is also known as a class variable. It is shared among all
										 * instances of the class and is used to store data that should be common for
										 * all objects.
										 */
		s1.show("Arya", 90);

	}

}

class Students {

	String name;
	int rollno;

	static int marks = 89;

	public void show(String name, int rn) {

		System.out.println("Student name is " + name + ",roll no: " + rn + "marks is:" + marks);
	}
}
