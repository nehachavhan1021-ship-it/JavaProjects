package com.neha.programs;

import java.util.*;

import com.neha.classes.Account;

public class Bancking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account a1 = new Account(1101, "Joe Root", "fixed", 73460.00);
		Account a2 = new Account(1527, "Jos Buttler", "ppf", 62190.00);
		Account a3 = new Account(1261, "Pat Cummins", "current", 44580.00);
		Account a4 = new Account(1103, "Dominik Szoboszlai", "fixed", 55900.00);
		Account a5 = new Account(1562, "Mohammed Salah", "ppf", 83720.00);

		// List<Account> acc=new ArrayList<>(); generally prefered this Because later we
		// can change the implementation easily:
		// eg,List<Account> acc = new ArrayList<>();===>//List<Account> acc = new
		// LinkedList<>();
//		The <Account> is the generic type.
		ArrayList<Account> acc = new ArrayList<>(); // This ArrayList is only for Account objects."

		acc.add(a1);
		acc.add(a2);
		acc.add(a3);
		acc.add(a4);
		acc.add(a5);
		System.out.println(acc);

		Iterator<Account> iterator = acc.iterator();

		while (iterator.hasNext())
			System.out.println(iterator.next());

	}

}
