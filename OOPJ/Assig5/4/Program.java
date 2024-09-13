package org.example.demo2;

import org.example.demo2.test1.Student;

public class Program {

	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.toString());
		Student s1 = new Student("Nimesh",186,"VI",'A');
		System.out.println(s1.toString());

	}

}
