//Problem: Write a Java program to check if a given number is an Armstrong number.

import java.util.Scanner;
import java.lang.Math;
class Q1{
	public static void main(String[] arr){
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		int number = value; 
		int compare = value;
		
		int sum =0;
		int n =0;
		do{
			if(number==0){
				break;
			}
			n++;
		}while((number=number/10) != 0);
		//System.out.println(n);
		
		while(value!=0){
			int rem = value%10;
			sum += Math.pow(rem,n);
			value = value/10;
		}
		
		if(compare == sum){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		sc.close();
		
	}
}

/*

C:\Users\91916\Downloads\Assig1>java Q1
Enter the number
153
true

C:\Users\91916\Downloads\Assig1>java Q1
Enter the number
123
false





Enter the number
12
2
Not Armstrong number

C:\Users\91916\Downloads>java Q1
Enter the number
153
3
Armstrong

C:\Users\91916\Downloads>java Q1
Enter the number
370
3
Armstrong

*/

