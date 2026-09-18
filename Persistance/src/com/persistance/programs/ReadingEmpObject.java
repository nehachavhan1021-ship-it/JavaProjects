package com.persistance.programs;

import java.io.*;

import com.neha.classes.Employee;

public class ReadingEmpObject {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		ObjectInputStream i = new ObjectInputStream(new FileInputStream("emp"));

		Employee obj = (Employee) i.readObject();
		System.out.println(obj);
		i.close();

	}

}
