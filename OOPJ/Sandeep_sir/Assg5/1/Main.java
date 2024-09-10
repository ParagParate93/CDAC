package org.example;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		InstanceCounter i = new InstanceCounter ();
		InstanceCounter.getReference();
		
		InstanceCounter i1 = new InstanceCounter (s1);
		InstanceCounter i2 = new InstanceCounter ();
		
		System.out.println("Count: "+InstanceCounter.getCounter());
		
	}

}
