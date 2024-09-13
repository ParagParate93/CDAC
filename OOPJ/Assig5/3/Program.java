package org.example.demo2;

import org.example.demo2.test1.Animal;
import org.example.demo2.test2.Dog;

public class Program {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.sleep();
		d.bark();
		
		Animal a = new Animal();
		a.eat();
		a.sleep();

	}

}
