/*

2)Implement a program that calculates the Body Mass Index (BMI) based on height and 
weight input using if-else to classify the BMI int categories (underweight, normal 
weight, overweight,etc).

Ref: https://www.geeksforgeeks.org/program-to-calculate-bmi/

*/


import java.util.*; 
  
class Bmi 
{ 
    
    public static double BMI(double height, double weight) 
    { 
        double bmi = weight / Math.pow(height, 2); 
        return bmi; 
    } 
    
    public static void main(String[] args) 
    { 
        Scanner s = new Scanner(System.in);
		System.out.println("Enter the height in m: ");
		double h = s.nextDouble(); 
		System.out.println("Enter the weight in kg: ");
        double w = s.nextDouble(); 
        
        double bmi = BMI(h, w); 
        System.out.print("The BMI is " + bmi + " so "); 
        
        if (bmi < 18.5) 
            System.out.print("underweight"); 
  
        else if (bmi >= 18.5 && bmi < 24.9) 
            System.out.print("Healthy"); 
  
        else if (bmi >= 24.9 && bmi < 30) 
            System.out.print("overweight"); 
  
        else if (bmi >= 30) 
            System.out.print("Suffering from Obesity"); 
    } 
} 

/*
o/p:

Enter the height in m:
1.68
Enter the weight in kg:
68
The BMI is 24.092970521541954 so Healthy

*/
