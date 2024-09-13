package org.example.demo2.test1;

public class Student{
	
	private String name;
	private int rollNo;
	private String standard;
	private char batch;
	
	public Student(){
		this("Ritesh",121,"VIII",'B');
	}
	
	public Student(String name, int rollNo, String standard, char batch) {
		this.name = name;
		this.rollNo = rollNo;
		this.standard = standard;
		this.batch = batch;
	}

	public String toString() {
		return this.name+" "+this.rollNo+" "+this.standard+" "+this.batch;
	}
	
}

