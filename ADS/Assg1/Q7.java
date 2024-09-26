/*

7. Find Repeated Characters in a String
Problem: Write a Java program to find all repeated characters in a string.

*/

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        findRepeatedCharacters(input);
    }

    public static void findRepeatedCharacters(String str) {
        System.out.print("Repeated characters: [");
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            boolean isRepeated = false;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && currentChar == str.charAt(j)) {
                    isRepeated = true;
					str = str.substring(0,j) + str.substring(j+1,str.length());
                    //continue;
                }
				
				if (isRepeated) {
                System.out.print("'"+currentChar+"'"+",");
                break;
				}
            }
            
        }
        System.out.println("]");
    }
}



/*
C:\Users\91916\Downloads\Assig1>javac Q7.java

C:\Users\91916\Downloads\Assig1>java Q7
Enter a string: programming
Repeated characters: ['r','g','m',]

C:\Users\91916\Downloads\Assig1>java Q7
Enter a string: hello
Repeated characters: ['l',]


*/

