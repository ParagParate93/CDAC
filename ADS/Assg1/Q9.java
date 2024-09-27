/*
9. Integer Palindrome
Problem: Write a Java program to check if a given integer is a palindrome.
*/

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        
        boolean isPalindrome = checkPalindrome(number);
        System.out.println(isPalindrome);
    }

    public static boolean checkPalindrome(int number) {
        if (number < 0) {
            return false; 
        }
        
        int original = number;
        int reversed = 0;
        
        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        
        return original == reversed;
    }
}


/*
C:\Users\91916\Downloads\Assig1>java Q9
Enter an integer: 121
true

C:\Users\91916\Downloads\Assig1>java Q9
Enter an integer: -121
false



*/

