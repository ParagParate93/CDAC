/*

Question 2: Days of the Week
Write a program that uses a nested switch statement to print out the day of the week 
based on an integer input (1 for Monday, 2 for Tuesday, etc.). Additionally, within 
each day, print whether it is a weekday or weekend.

*/

class Days{
	public static void main(String args[]){
		int daynum = 5;
		switch(daynum){
			case 1:
				System.out.println("Monday");
				switch (daynum){
					case 1:
					System.out.println("Weekday");
				}
				break;
				
			case 2:
				System.out.println("Tuesday");
				switch (daynum){
					case 2:
					System.out.println("Weekday");
				}
				break;
			
			case 3:
				System.out.println("Wednesday");
				switch (daynum){
					case 3:
					System.out.println("Weekday");
				}
				break;
				
	        case 4:
				System.out.println("Thursday");
				switch (daynum){
					case 4:
					System.out.println("Weekday");
				}
				break;
				
			case 5:
				System.out.println("Friday");
				switch (daynum){
					case 5:
					System.out.println("Weekday");
				}
				break;
				
			case 6:
				System.out.println("Saturday");
				switch (daynum){
					case 6:
					System.out.println("Weekend");
				}
				break;
				
			case 7:
				System.out.println("Sunday");
				switch (daynum){
					case 7:
					System.out.println("Weekend");
				}
				break;
				
			default:
				System.out.println("Please input a valid range 1-7");
				break;
				

		}
	}
}