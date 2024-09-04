/*
5)Write a program that allows the user to select a shape (Circle, Square, Rectangle, 
Triangle) and then calculates the area based on user-provided dimensions using a 
switch case.

*/
import java.util.*;

class Area{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("select a shape Circle, Square, Rectangle, Triangle");
		String shape=s.nextLine();
		switch(shape){
			case "Circle":
				System.out.println("Enter the radius: ");
				float r = s.nextFloat();
				System.out.println("Area: "+(Math.PI*Math.pow(r,2)));
				break;
			case "Square":
				System.out.println("Enter the length of side: ");
				double side = s.nextDouble();
				System.out.println("Area: "+(side*side));
				break;
			case "Rectangle":
				System.out.println("Enter the length: ");
				double l = s.nextDouble();
				System.out.println("Enter the breath: ");
				double b = s.nextDouble();
				System.out.println("Area: "+(l*b));
				break;
			case "Triangle":
				System.out.println("Enter the base: ");
				double ba = s.nextDouble();
				System.out.println("Enter the height: ");
				double h = s.nextDouble();
				System.out.println("Area: "+(0.5*ba*h));
				break;
			default:
				System.out.println("Enter a valid input");
			
		}
	}
}