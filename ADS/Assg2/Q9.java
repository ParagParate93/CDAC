/*
9. String Palindrome
Problem: Write a Java program to check if a given string is a palindrome.
*/

import java.util.Scanner;

public class Q9 {
    public static boolean isPalindrome(String str) {
        int first = 0, last = str.length() - 1;
        while (first < last) {
            if (str.charAt(first) != str.charAt(last)) {
                return false;
            }
            first++;
            last--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        boolean result = isPalindrome(input);
        System.out.println(result);
    }
}

/*
C:\Users\91916\Downloads\Assg2_M>javac Q9.java

C:\Users\91916\Downloads\Assg2_M>java Q9
madam
true

C:\Users\91916\Downloads\Assg2_M>java Q9
hello
false

*/
