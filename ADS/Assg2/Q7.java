/*
7. Reverse a Number
Problem: Write a Java program to reverse a given number.
*/

import java.util.Scanner;

public class Q7 {
    public static int reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int reversedNumber = reverse(input);
        System.out.println(reversedNumber);
    }
}

/*
C:\Users\91916\Downloads\Assg2_M>javac Q7.java

C:\Users\91916\Downloads\Assg2_M>java Q7
12345
54321

C:\Users\91916\Downloads\Assg2_M>java Q7
-9876
-6789

*/

