package com.neha.classes;

public abstract class StudentPeformance {
	
	//abstract method
		public abstract void findPercentage(int totalscore);
		
		//concrete method
		public void showMessage()
		{
			System.out.println("performance data updated");
		}
}
