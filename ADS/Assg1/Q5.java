// Problem: Write a Java program to find the Greatest Common Divisor (GCD) of two numbers.

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        
        System.out.println("GCD of " + a + " and " + b + " is " + gcd(a, b));
    }

    public static int gcd(int x, int y) {
        /*
		while (y != 0) { //euclidean algo
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
		*/
		int gcd = 0;
		for(int i=1; i<x && i<y; i++){
			if(x%i==0 && y%i ==0){
				gcd = i;
			}
		}
		return gcd;
    }
}

/*
C:\Users\91916\Downloads\Assig1>java Q5
Enter the first number: 54
Enter the second number: 24
GCD of 54 and 24 is 6

C:\Users\91916\Downloads\Assig1>java Q5
Enter the first number: 17
Enter the second number: 13
GCD of 17 and 13 is 1
*/



