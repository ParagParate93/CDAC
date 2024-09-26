// Problem: Write a Java program to compute the factorial of a given number.

import java.util.Scanner;

class Q3{
	public static int Fact(int value){
		if(value ==1){
			return 1;
		}
		int op = value * Fact(value-1);
		return op;
	}
	public static void main(String[] arr){
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		int res = Fact(value);
		System.out.println("Factorial is : " + res);
		
	}
}

/*

C:\Users\91916\Downloads>javac Q3.java

C:\Users\91916\Downloads>java Q3
Enter the number
5
Factorial is : 120

C:\Users\91916\Downloads>java Q3
Enter the number
6
Factorial is : 720

*/

