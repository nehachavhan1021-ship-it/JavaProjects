package com.neha.programs;

public class MultilevelInheiritance {
//	In Multilevel Inheritance, a derived class will be inheriting
//	a base class and as well as the derived class also acts as the base class for other classes.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog ob = new BabyDog();
		ob.eat();
		ob.bark();
		ob.weep();

	}

}
//Grandparent Class
class Animal {
	void eat() {
		System.out.println("This animal eats food.");
	}
}

// Parent Class (inherits from Animal)
class Dog extends Animal {
	void bark() {
		System.out.println("The dog barks.");
	}
}

// Child Class (inherits from Dog)
class BabyDog extends Dog {
	void weep() {
		System.out.println("The baby dog weeps.");
	}
}
