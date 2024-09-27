/*
10. Leap Year
Problem: Write a Java program to check if a given year is a leap year.
*/

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        
        boolean isLeap = checkLeapYear(year);
        System.out.println(isLeap);
    }

    public static boolean checkLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }
}


/*
C:\Users\91916\Downloads\Assig1>java Q10
Enter a year: 2020
true

C:\Users\91916\Downloads\Assig1>java Q10
Enter a year: 1900
false

*/


