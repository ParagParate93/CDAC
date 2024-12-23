/* class Exercise{
     public static void main(String args[]){
	     int sum = 0;
		 for (int i=1; i<=50; i++){
		    sum += i;
		 }
		 System.out.println("Sum of the first 50 natural numbers : " + sum);
	 
	 }

} */

/*
Write a program to calculate the sum of the first 50 natural numbers.
o/p

Sum of the first 50 natural numbers : 1275

*/


/* class Exercise{
     public static void main(String args[]){
		 int result = 1;
		 for (int x=10; x>1; x--){
		    result *= x;
		 }
		 System.out.println("Factorial of the number 10: " + result);
	 
	 }

}
 */

/*
Write a program to compute the factorial of the number 10.
o/p

Factorial of the number 10: 3628800

*/

//OR



/* class Exercise{
     public static void main(String args[]){
	
		 int x = 10;
		 int result = Fact(x);
		 System.out.println("Factorial of the number 10: " + result);
	 
	 }
     
	   static int Fact(int y){
	        
			if(y == 1){
				return 1;
			}
			int r = y * Fact(y-1);
			return r;
        }

} */

/*
Write a program to compute the factorial of the number 10.
O/P

Factorial of the number 10: 3628800

*/

/* class Exercise{
		public static void main(String args[]){
			for (int x =1; x<=100; x++){
				if(x % 7 == 0){
					System.out.print(x+" ");
				}
				
			}
			
		}
}
 */
 
/*
Write a program to print all multiples of 7 between 1 and 100.
o/p:
7 14 21 28 35 42 49 56 63 70 77 84 91 98

*/

/* class Exercise{
	public static void main(String args[]){
		int num = 1234, reverse = 0;
		for(; num!=0; num= num/10 ){
			int rem = num % 10;
			reverse = reverse*10 + rem;
			
		}
		System.out.print(" Reversed no is: "+reverse);
		
	}
	
} */


/*
Write a program to reverse the digits of the number 1234. The output should be 4321.
o/p:
Reversed no is: 4321

*/

/* 
class Exercise{
	public static void main(String args[]){
		 int num1=0, num2=1;
		 for(int i=1; num1<=21; i++){
           
			 System.out.print(num1 + " ");
			 int num3= num1+num2;
			 num1=num2;
			 num2=num3;
			 
		}
		
	}
	
}

 */
 
/*
Write a program to print the Fibonacci sequence up to the number 21.
o/p
0 1 1 2 3 5 8 13 21

*/




/* class Exercise{
	
	static boolean isPrime(int x){
			if(x == 1){
				return false;
			}
			
			for(int i=2; i<x ;i++){
				if(x % i == 0){
					return false;
				}
			}
			
			return true; 
		}
		
	public static void main(String args[]){
		int count =1;
		
		for(int n =1; count<=5; n++){
			if(isPrime(n)){
				System.out.print(n + " ");
				count += 1;
			}
		}
		
		
		
	}
}
 */

/*
Write a program to find and print the first 5 prime numbers.
o/p:
2 3 5 7 11
*/

/* class Exercise{
	public static void main(String args[]){
		int sum = 0;
		int n = 9876;
		for(; n!=0; n=n/10){
			int x=n%10;
			sum=sum+x;
		}
		System.out.print(sum);
	}
	
}
 */
 
 
/*
Write a program to calculate the sum of the digits of the number 9876. The output 
should be 30 (9 + 8 + 7 + 6).
o/p:
30
*/

/* class Exercise{
	public static void main(String args[]){
		
		for(int i=10; i>=0; i--){
				System.out.print(i+" ");
		}
	}
}
 */
 
/*
Write a program to count down from 10 to 0, printing each number.
o/p:
10 9 8 7 6 5 4 3 2 1 0

*/

/* class Exercise{
	public static void main(String args[]){
		
		int num = 4825;
		int largestDigit = 0;
		
		while(num !=0){
			
			int digit = num%10;
			
			if(digit > largestDigit){
				largestDigit = digit;
				
			}
			
			num /= 10;
		}
		
		System.out.print(largestDigit);
	}
	
}
 */

/*
Write a program to find and print the largest digit in the number 4825.
o/p:
8
*/

/* class Exercise{
	public static void main(String args[]){
			for(int i=1; i<=50; i++){
				if(i%2==0){
					System.out.print(i+" ");
				}
			}
	}
} */

/*
Write a program to print all even numbers between 1 and 50.
o/p:
2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50
*/


/* class Exercise{
	public static void main(String args[]){
		int x = 5,y = 7;
		int z = ++x + y-- - --y - --x + -- y;
		System.out.print(z);
	}
}
 */

/*
Write a Java program to demonstrate the use of both pre-increment and 
post-decrement operators in a single expression
o/p:
7

evulation:
z= 6 + 7 - 5 - 5 + 4 = 7

*/

// 12

/* class Exercise{
	public static void main(String args[]){
		for(int i=1; i<=5; i++){
			for(int j=1; j<=5; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
} */

//13 refered: https://www.geeksforgeeks.org/program-to-print-half-diamond-star-pattern/

/* class Exercise{
	static void halfDiamond(int N){
		
		int i,j;
		
		for(i=1; i<=N; i++){
			for(j=1; j<=i; j++){
				System.out.print(i);
				if(j<i){
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		for(i=5; i>=1; i--){
			for(j=1; j<=i; j++){
				System.out.print(i);
				if(j<i){
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
	
	
	public static void main(String args[]){
		int N = 5;
		halfDiamond(N);	
	
	
	}
	
} */

//14
/*

*
**
***
*****
*******
*********

*/

/* class Exercise{
	public static void main(String args[]){
		for (int i=1; i<=9; i++){
			if(i !=4 && i!=6 && i!=8){
				
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
			
			}
		}
		
		
	}
}
 */

/*15**** https://www.geeksforgeeks.org/programs-printing-pyramid-patterns-java/

    *
   * *
  * * *
 * * * *
* * * * *

*/

/* class Exercise{
	public static void main(String args[]){
		for(int i=1; i<=5; i++){
			for(int j=5-i; j>=1; j--){
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
} */

/* 16*****

    *
   ***
  *****
 *******
*********

*/

/* class Exercise{
	public static void main(String args[]){
		for(int i=1;i<=5;i++){
			for(int s=i; s<5; s++){
				System.out.print(" ");
			}
			for(int j=1; j<=((i*2)-1); j++){
				System.out.print("*");	
			}
				System.out.println();
		}
	}
} */

//OR 

/* class Exercise
{
	public static void main(String... args)
	{
		int row=5;
		for(int i=1;i<=row;i++)
		{
			for(int S=1;S<=(row-i);S++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=((2*i)-1);j++) //this ((2*i)-1) is for i and j relation 
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}  */

/* 17

* * * * *
 * * * *
  * * *
   * *
    *
	
*/


/* class Exercise{
	public static void main(String args[]){
		for(int i=1; i<=5; i++){
			for(int s=1; s<i; s++){
				System.out.print(" ");				
			}
			for(int j=i; j<=5; j++){
				System.out.print("* ");
			}
			System.out.println();

		}
		
	}
}
 */
 
 
/* 18
https://www.geeksforgeeks.org/java-program-to-print-diamond-shape-star-pattern/

   *
  ***
 *****
*******
 *****
  ***
   *

*/


/* class Exercise{
	public static void main(String args[]){
		
		for(int i=1; i<=4; i++){
			for(int s=1; s<=4-i; s++){
				System.out.print(" ");
			}
			for(int j=1; j<=(i*2)-1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		 
		for(int m=3; m>=1; m--){ //**
			for(int s1=1; s1<=(4-m); s1++){  //**
				System.out.print(" ");
			}
			for(int n=1; n<=(2*m)-1; n++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
 */
 
 
/*
25

1
12
123
1234
12345

*/ 

/* class Exercise{
	public static void main(String args[]){
		for(int i=1; i<=5; i++){
			for(int j=1; j<=i; j++){
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
} */

/*
24

1
22
333
4444
55555
*/

/* class Exercise{
	public static void main(String args[]){
		for(int i=1; i<=5; i++){
			for(int j=1; j<=i; j++){
				System.out.print(i);
			}
			System.out.println();
		}
		
	}
} */

/*
23

11111
22222
33333
44444
55555
*/

/* class Exercise{
	public static void main(String args[]){
		for(int i=1; i<=5; i++){
			for(int j=1; j<=5; j++){
				System.out.print(i);
			}
			System.out.println();
		}
		
	}
}
 */

/*
26

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/


/* class Exercise{
	public static void main(String args[]){
		int num=0;
		for(int i=1; i<=5; i++){
			for(int j=1; j<=i; j++){
				num++;
				System.out.print(num+" ");
			}
			System.out.println();
		}
		
	}
}
 */
 
/*
19.

1
1*2
1*2*3
1*2*3*4
1*2*3*4*5

*/
 
 
/* class Exercise{
	public static void main(String args[]){
		
		for(int i=1; i<=5; i++){
			for(int j=1; j<=i; j++){
				if(j==i){
					System.out.print(j);
					break;
				}
				System.out.print(j+"*");
			}
			System.out.println();
		}
		
	}
}
 */

/*
20

5
5*4
5*4*3
5*4*3*2
5*4*3*2*1
*/ 
 
/* class Exercise{
	public static void main(String args[]){
		
		for(int i=5; i>=1; i--){
			for(int j=5; j>=i; j--){
				if(j==5){
					System.out.print(j);
					continue;    //instead of break(break loop) it should be continue (next iteration).
				}
				System.out.print("*"+j);
			}
			System.out.println();
		}
		
	}
} 

 */

/*

*/

/*
21

1
1*3
1*3*5
1*3*5*7
1*3*5*7*9
*/

 
/* class Exercise{
	public static void main(String args[]){
		
		for(int i=1; i<=5; i++){
			for(int j=1; j<=5; j++){
				if(j==i){
					System.out.print(((2*j)-1));
					break;
				}
				System.out.print(((2*j)-1)+"*");
			}
			System.out.println();
		}
		
	}
}
 */


/*
22 ******

*********
 *******
  *****
   ***
    *
   ***
  *****
 *******
*********

*/

class Exercise{
	public static void main(String args[]){
		for(int d=5; d>=1; d--){  // d for down 
			for(int r=5; r>d; r--){ //for printing spaces or int s**
				System.out.print(" ");
			}
			for(int c=1; c<=(d*2)-1; c++ ){ // for printing * (r -row, c-column)
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int u=4; u>=1; u--){    // u for upper
			for(int r=1; r<u; r++){ //for printing spaces or int s**
				System.out.print(" ");
			}
			for(int c=1; c<=((4-u)*2)+3; c++ ){ // for printing * (r -row, c-column)
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

