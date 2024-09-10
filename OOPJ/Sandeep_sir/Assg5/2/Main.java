package org.example.Assg5_2;


public class Main{

	public static void main(String[] args) {
		Logger l1 = Logger.getInstance();
		l1.log("message_1");
		l1.log("message_2");
		l1.log("message_3");
		l1.log("message_4");
		
		System.out.println(l1.getLog());
		System.out.println(l1.getLog());
		
		l1.clearLog();
		System.out.println(l1.getLog());
	}

}
