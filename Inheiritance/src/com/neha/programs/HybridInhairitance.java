package com.neha.programs;

public class HybridInhairitance {
	
//	mix of single ,multilevel and heirarchical inheiritance

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		D obj = new D();
		obj.dispA();
		obj.dispC();
		obj.dispD();

	}

}

class C
{
   public void dispC()
   {
	System.out.println("C");
   }
}

class A extends C
{
   public void dispA()
   {
	System.out.println("A");
   }
}

class B extends C
{
   public void dispB()
   {
	System.out.println("B");
   }
	
}

class D extends A
{
   public void dispD()
   {
	System.out.println("D");
   }
}
	
