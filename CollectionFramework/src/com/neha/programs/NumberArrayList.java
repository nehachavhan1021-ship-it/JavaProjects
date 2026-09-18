package com.neha.programs;

import java.util.*;

public class NumberArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> nums=new ArrayList<>();
		nums.add(23);
		nums.add(56);
		nums.add(43);
		nums.add(22);
		nums.add(78);
		nums.add(34);
		nums.add(89);
//		Collections.sort(nums);
//		System.out.println(nums);
		//for (int i=0;i<nums.size();i++) {
//			Collections.sort(nums);
			
//			        i=0 → 23
//					sort → [22,23,34,43,56,78,89]
//					i=1 → 23
		//	System.out.println(nums.get(i));
		//Collections.sort(nums); // output :
//			23
//			23
//			34
//			43
//			56
//			78
//			89
			
		//}

		Iterator<Integer> i=nums.iterator();
		while(i.hasNext())
		System.out.println(i.next());
		
		


	}

}
