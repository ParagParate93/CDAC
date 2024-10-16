/*

3)Write a program that checks if a person is eligible to vote based on their age.

*/

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        char input = 'Y';
 
        while (input == 'Y') {
            
            System.out.println("Enter your age:");
            int age = s.nextInt();
 
            if (age >= 18) {
                System.out.println("Person is allowed to vote");
            } 
			else {
                System.out.println("Person is not allowed to vote");
            }
 
            System.out.println("To continue press Y");
            System.out.println("To exit press another key");
            input = s.next().charAt(0);
        }
 
        System.out.println("Program Terminated");
        s.close();
    }
}

/*
O/P:

java Voting
Enter your age:
12
Person is not allowed to vote
To continue press Y
To exit press another key
Y
Enter your age:
21
Person is allowed to vote
To continue press Y
To exit press another key
Y
Enter your age:
18
Person is allowed to vote
To continue press Y
To exit press another key
y
Program Terminated

*/