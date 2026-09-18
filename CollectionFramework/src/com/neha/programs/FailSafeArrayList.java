package com.neha.programs;

import java.util.*;
import java.util.concurrent.*;

public class FailSafeArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList<String> names=new ArrayList<>();
		 // Creating a CopyOnWriteArrayList
		CopyOnWriteArrayList<String> lst = new CopyOnWriteArrayList<String>();  
//		Thread-safe version of ArrayList suitable for concurrent access.
//		All update operations create a cloned copy of the underlying list.

		
		lst.add("neha");
		lst.add("sql");
		lst.add("java");
		lst.add("cse");
		lst.add("english");
		Iterator<String> it = lst.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());
			if (!lst.contains("chavhan"))
				lst.add(2, "chavhan");


			// names.add("chavhan"); //show ConcurrentModificationException
		}
		System.out.println(lst);

	}

}
