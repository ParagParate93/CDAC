// Problem: Write a Java program to find the square root of a given number (using integer approximation).

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: x = ");
        int x = sc.nextInt();
        
        System.out.println("Output: " + integerSqrt(x));
    }

    public static int integerSqrt(int x) {
        if (x < 0) {
            return -1; 
        }
        int result = 0;

        while (result * result <= x) {
            result++;
        }

        return result - 1;
    }
}


/*

C:\Users\91916\Downloads\Assig1>javac Q6.java

C:\Users\91916\Downloads\Assig1>java Q6
Input: x = 16
Output: 4

C:\Users\91916\Downloads\Assig1>java Q6
Input: x = 27
Output: 5


*/

