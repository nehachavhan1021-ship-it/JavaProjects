package com.main.programs;

import com.neha.classes.*;

//Rules of Method Overriding
//Rule 1: Inheritance is required
//Rule 2: Method name must be the same
//Rule 3: Parameters must be the same
//rule 4:The return type should be the same,
//Rule 5: Access modifier cannot be more restrictive




public class TestSound {

	public static void main(String[] args) {
		

//		Why do we need overriding?
//      Suppose every animal makes a different sound.Instead of creating completely different method names:dogSound()
//		catSound()
//		cowSound()  we can use the same method:sound() and use them like 

		Cat obj = new Cat();
		obj.sound();       // meow
		Dog ob = new Dog();
		ob.sound();        // dog bark

		
		
		//		Animal ob=new Animal();
        //		ob.sound();

	}

}
