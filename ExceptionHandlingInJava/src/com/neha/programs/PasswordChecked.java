package com.neha.programs;

import java.util.Scanner;

public class PasswordChecked {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String password;

		try {

			password = sc.next();

			if (password.length() < 8) {
				throw new Exception();
				

			}
			System.out.println("Your password is " + password);

		} catch (Exception e) {
			System.out.println("invalid password");
		}

	}

}
