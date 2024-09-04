/*

4)Write a program that takes a month (1-12) and prints the corresponding season 
(Winter, Spring, Summer, Autumn) using a switch case

*/

import java.util.*;

class Season{
	public static void main(String args []){
	Scanner s = new Scanner(System.in);
	int month = s.nextInt();
	
	int monthIndex = month - 1;
        
switch (monthIndex) {
    case 0: case 1: case 10: case 11:
        System.out.println("Winter");
        break;
    case 2: case 3: case 4: case 5:
        System.out.println("Summer");
        break;
    default:
        System.out.println("Rainy");
	}
	
	}
}

/*
o/p:

java Season
5
Summer

C:\Users\91916\eclipse-workspace>java Season
6
Summer

C:\Users\91916\eclipse-workspace>java Season
7
Rainy

C:\Users\91916\eclipse-workspace>java Season
8
Rainy

C:\Users\91916\eclipse-workspace>java Season
9
Rainy

C:\Users\91916\eclipse-workspace>java Season
10
Rainy

C:\Users\91916\eclipse-workspace>java Season
11
Winter


*/
