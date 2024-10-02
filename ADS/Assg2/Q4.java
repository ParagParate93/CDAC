/*
4. Reverse a String
Problem: Write a Java program to reverse a given string.
*/

import java.util.Scanner;

public class Q4 {
    public static String reverse(String strnew) {
        StringBuilder reverse = new StringBuilder(strnew);
        return reverse.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverse(str));
    }
}

/*

C:\Users\91916\Downloads\Assg2_M>java Q4
hello
olleh

C:\Users\91916\Downloads\Assg2_M>java Q4
Java
avaJ

*/

