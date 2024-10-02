/*
1. Printing Patterns
Problem: Write a Java program to print patterns such as a right triangle of stars.
*/

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*

C:\Users\91916\Downloads\Assg2_M>java Q1
3
*
**
***

C:\Users\91916\Downloads\Assg2_M>java Q1
5
*
**
***
****
*****

*/

