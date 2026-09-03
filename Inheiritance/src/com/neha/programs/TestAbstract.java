package com.neha.programs;

//abstract :-class=>can't create object ,pure base class,use to inheirit
//function=>without body ,write body in derived class 

public class TestAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animals ob = new Animals();
//		Greet o=new Greet(); //cant create object of abstract class

		ob.show();
		ob.showInfo();
		ob.test();
		ob.displayInfo();

	}

}

abstract class Greet { // only use to inheirit //cant create object //pure base class

	public void show() {

		System.out.println("welcome to java");
	}

	public abstract void displayInfo();

}

class Two02 extends Greet {

	public void test() {
		System.out.println("abstract class tested ok");
	}

	public void displayInfo() {

		System.out.println("abstract function");
	}
}

class Neha extends Two02 {

	public void showInfo() {
		System.out.println("name is neha");
	}
}

class Animals extends Neha {

	public void displayInfo() { // we need to override all the abstract methods of the super-class or, make the
								// subclass abstract

		// eg.public abstract Animals extends Neha{}

		System.out.println("abstract function two");
	}
}

//Abstraction in Java is the process of hiding internal implementation details and showing only essential functionality to the user.
//Reduces Complexity: Hides irrelevant background details from the user.
//Abstract Class //use to inheirit
//abstract class Praffull
//{
//    public void show()
//    {
//        System.out.println("welcome to Praffull class");
//    }
//    // Abstract method (no body) //write body in derived class
//    public abstract void displayInfo();
//       
//}
//
//class Soham extends Praffull
//{
//    public void test()
//    {
//        System.out.println("abstract class tested ok");
//    }
//    //taken from the base class
//    public void displayInfo()
//    {
//        System.out.println("Name is Soham");
//    }
//}
//
//class Swami extends Praffull
//{
//    public void displayInfo()
//    {
//        System.out.println("Name Aarya Kale");
//    }
//}
//
//
//class TestAbstract
//{
//    public static void main(String[] args)
//    {
//        Soham s=new Soham();
//        s.show();
//        s.test();
//        s.displayInfo();
//        Swami s1=new Swami();
//        s1.displayInfo();
//    }
//}