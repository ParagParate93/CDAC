/*
6. Reverse Words in a String
Problem: Write a Java program to reverse the words in a given sentence.
*/

import java.util.Scanner;

public class Q6 {
    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder reversed = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) { 
                reversed.append(" ");
            }
        }
        
        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(reverseWords(input));
    }
}


/*
output:
C:\Users\91916\Downloads\Assg2_M>javac Q6.java

C:\Users\91916\Downloads\Assg2_M>java Q6
Hello World
World Hello

C:\Users\91916\Downloads\Assg2_M>java Q6
Java Programming
Programming Java

*/


