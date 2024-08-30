/*

Question 4: Discount Calculation
Write a program to calculate the discount based on the total purchase amount. Use 
the following criteria:
 If the total purchase is greater than or equal to Rs.1000, apply a 20% discount.
 If the total purchase is between Rs.500 and Rs.999, apply a 10% discount.
 If the total purchase is less than Rs.500, apply a 5% discount.
Additionally, if the user has a membership card, increase the discount by 5%.

*/
import java.util.*;

class Discount{
	public static void main(String args[]){
			Scanner s1 = new Scanner(System.in);
			System.out.print("Enter the purchase amount in Rs: ");
			float pamount = s1.nextFloat();
			System.out.print("Do you have a membership card? (Y/N): ");
			char mc = s1.next().charAt(0);
			mc = Character.toUpperCase(mc);
			
			if(pamount>= 1000){
				if(mc=='Y'){
					pamount *=0.75;	
				}
				else{
					pamount *=0.80;
				}
			}
			else if(pamount>=500 && pamount <=999){
				if(mc=='Y'){
					pamount*=0.85;
				}
				else{	
					pamount *= 0.9;
			    }
			}	
			else{
				if(mc =='Y'){
					pamount*=0.9;
				}
				else{
					pamount*=0.95;
				}
			}
			
			System.out.println("The amount after discount is: "+pamount);
			
	}
}

