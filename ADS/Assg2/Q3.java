/*
3. Remove White Spaces from String
Problem: Write a Java program to remove all white spaces from a given string.
*/


import java.util.Scanner;

public class Q3 {
    public static String removeSpaces(String str) {
        return str.replaceAll("\\s", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(removeSpaces(str));
    }
}

/*
o/p:

C:\Users\91916\Downloads\Assg2_M>javac Q3.java

C:\Users\91916\Downloads\Assg2_M>java Q3
Hello World
HelloWorld

C:\Users\91916\Downloads\Assg2_M>java Q3
  Java   Programming
JavaProgramming

*/

