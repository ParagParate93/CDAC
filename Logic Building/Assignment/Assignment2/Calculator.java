/*

Question 3: Calculator
Write a program that acts as a simple calculator. It should accept two numbers and 
an operator (+, -, *, /) as input. Use a switch statement to perform the appropriate 
operation. Use nested ifelse to check if division by zero is attempted and display 
an error message.

Ref: https://www.javatpoint.com/how-to-read-character-in-java
*/

import java.util.*;

class Calculator{
	public static void main(String args[]){
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		int a = s1.nextInt();
		System.out.println("Enter number 2: ");
		int b = s1.nextInt();
		System.out.println("Enter the operation to perform (+, -, *,/) ");
		//String c = s1.nextLine(); // check next & nextLine()
		char c = s1.next().charAt(0);
		switch (c){
			case '+':
				System.out.println("Sum of numbers is: "+(a+b));
				break;
			case '-':
				System.out.println("Substraction of numbers is: "+(a-b));
				break;
			case '*':
				System.out.println("Multiplication of numbers is: "+(a*b));
				break;
			case '/':
				if(b!=0){
					System.out.println("Division of numbers is: "+(a/b));
				}
				else{
					System.out.println("Division by zero is not possible !!!");
				}
				break;
			default:
				System.out.println("Please input a valid operator");
				
		}
		
	}
}

