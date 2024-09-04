/* CDAC Mumbai PG-DAC AUGUST 24
 Assignment No- 2

1)Write a program that checks if a given year is a leap year or not using both if-else 
and switch-case.

*/

import java.util.*;

public class Leapyr {
	public static void main(String[] args) {
		
		System.out.println("Enter year: ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		int flag = 0;
		if(year % 4 == 0) {
			flag = 1;
		    if (year % 100 == 0){
		        if (year % 400 == 0) {
			    flag = 1;
		        } 
				else {
			    flag = 0;
		        }
		    }
		}
		switch(flag) {
		case 1:
			System.out.println(year + " is a leap year");
			break;
		case 0: 
			System.out.println(year + " is not a leap year");
			break;
		}
	}
}

/*
o/p:

java Leapyr
Enter year:
900
900 is not a leap year

C:\Users\91916\eclipse-workspace>java Leapyr
Enter year:
2024
2024 is a leap year

*/

