package com.main.programs;

import com.neha.classes.*;

public class PlayerInfo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Player02 obj = new Player02();
//		obj.name="Neha"; // cannot use private data member like this for that we use setter and getter
//		System.out.println(name);

		obj.setName("Neha");
		System.out.println(obj.getName());
		obj.setAge(30);
		System.out.println(obj.getAge());

		int a = obj.getAge();
		if (a >= 18)

			System.out.println("you can vote");

		else
			System.out.println("your not eligible to vote");

	}

}
