/* 
1. Working with java.lang.Boolean

b. Declare a method-local variable status of type boolean with the value true and 
convert it to a String using the toString method. (Hint: Use Boolean.toString(Boolean) ).

*/

/* class Assigtwo{
	public static void main(String args[]){
		boolean bool=true;
		String str=Boolean.toString(bool);
		System.out.println(str);
	}
} */

/*
c. Declare a method-local variable strStatus of type String with the value "true" and convert 
it to a boolean using the parseBoolean method. (Hint: Use Boolean.parseBoolean(String)).
*/

/* class Assigtwo{
	public static void main(String args[]){
		String strStatus = "true";
		Boolean bool=Boolean.parseBoolean(strStatus);
		System.out.println(bool);
	}
}
 */

/*
d. Declare a method-local variable strStatus of type String with the value "1" or "0" and attempt 
to convert it to a boolean. (Hint: parseBoolean method will not work as expected with "1" or "0").

*/

/* class Assigtwo{
	public static void main(String args[]){
		String strStatus = new String ("1");
		Boolean bool=Boolean.parseBoolean(strStatus);
		System.out.println(bool);
	}
}
 */ 

/* class Assigtwo{ 
	public static void main(String args[]){
		String strStatus = "1"; 
		boolean statusUsingParseBoolean = Boolean.parseBoolean(strStatus);
		boolean status = strStatus.equals("1");
		System.out.println(status);
		System.out.println(statusUsingParseBoolean);
}
}
 */

/*
o:p for "1"
false
o:p for "0"
false

*/

/*
e. Declare a method-local variable status of type boolean with the value true and convert it to the 
corresponding wrapper class using Boolean.valueOf(). (Hint: Use Boolean.valueOf(boolean)).

*/


/* class Assigtwo{
	public static void main(String args[]){
		Boolean status = true;
		Boolean bool=Boolean.valueOf(status);
		System.out.println(bool);
	}
} */

/*
true
*/

/*
f. Declare a method-local variable strStatus of type String with the value "true" and convert it to the 
corresponding wrapper class using Boolean.valueOf(). (Hint: Use Boolean.valueOf(String)).

*/

/* class Assigtwo{
	public static void main(String args[]){
		String strStatus = "true";
		Boolean bool=Boolean.valueOf(strStatus);
		System.out.println(bool);
	}
} */

/*
true
*/

/*
2. Working with java.lang.Byte
a. Explore the Java API documentation for java.lang.Byte and observe its modifiers and super types.
b. Write a program to test how many bytes are used to represent a byte value using the BYTES field. (Hint: Use Byte.BYTES).

*/

/* class Assigtwo{
	public static void main(String args[]){
		System.out.println(Byte.BYTES);
	}
} //op:1
 */

/*
c. Write a program to find the minimum and maximum values of byte using the MIN_VALUE and MAX_VALUE fields. (Hint: Use Byte.MIN_VALUE and Byte.MAX_VALUE).
*/


/* class Assigtwo{
	public static void main(String args[]){
		System.out.println(Byte.MIN_VALUE); //-128
		System.out.println(Byte.MAX_VALUE); // 127
	}
}
 */

/*
d. Declare a method-local variable number of type byte with some value and convert it to a String using the toString method. (Hint: Use Byte.toString(byte)).

*/

/* class Assigtwo{
	public static void main(String args[]){
		byte number = 123;
		String s = Byte.toString(number);
		System.out.println(s);
		
	}
}
 */

/*
e. Declare a method-local variable strNumber of type String with some value and convert it to a byte value using the parseByte method. (Hint: Use Byte.parseByte(String)).

*/


/* class Assigtwo{
	public static void main(String args[]){
		String strNumber = "35";
		byte s = Byte.parseByte(strNumber);
		System.out.println(s);
		
	}
}
 */

/*
f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a byte value. 
(Hint: parseByte method will throw a NumberFormatException).

*/


/* class Assigtwo{
	public static void main(String args[]){
		String strNumber = "Ab12Cd3";
		byte s = Byte.parseByte(strNumber);
		System.out.println(s);
		
	}
}
 */


/*
g. Declare a method-local variable number of type byte with some value and convert it to the corresponding wrapper class using Byte.valueOf(). (Hint: Use Byte.valueOf(byte)).
*/



/* class Assigtwo{
	public static void main(String args[]){
		byte number = 12;
		byte s = Byte.valueOf(number);
		System.out.println(s);
		
	}
}
 */

/*
h. Declare a method-local variable strNumber of type String with some byte value and convert it to the corresponding 
wrapper class using Byte.valueOf(). (Hint: Use Byte.valueOf(String)).
*/

/* class Assigtwo{
	public static void main(String args[]){
		String strNumber = "13";
		byte s = Byte.valueOf(strNumber);
		System.out.println(s);
		
	}
} */

/*
i. Experiment with converting a byte value into other primitive types or vice versa and observe the results.
*/

/* class Assigtwo{
	public static void main(String args[]){
		byte number = 33;
		int s = number;
		System.out.println(s); //Widening
		
	}
} */

/* class Assigtwo{
	public static void main(String args[]){
		double number = 33.45d;
		byte s = (byte)number;
		System.out.println(s); //Narrowing
		
	}
} */



/* class Assigtwo{
	public static void main(String args[]){
		double number = 33.45d;
		byte s = (byte)number;
		System.out.println(s); //Narrowing
		
	}
} */

/*
3. Working with java.lang.Short
a. Explore the Java API documentation for java.lang.Short and observe its modifiers and super types.
b. Write a program to test how many bytes are used to represent a short value using the BYTES field. (Hint: Use Short.BYTES).
c. Write a program to find the minimum and maximum values of short using the MIN_VALUE and MAX_VALUE fields. (Hint: Use Short.MIN_VALUE and Short.MAX_VALUE).
*/

/* class Assigtwo{
	public static void main(String args[]){
		System.out.println(Short.BYTES); 
		
	}
}
 */

/* class Assigtwo{
	public static void main(String args[]){
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);		
	}
} */

/*
d. Declare a method-local variable number of type short with some value and convert it to a String using the toString method. (Hint: Use Short.toString(short)).
*/


/* class Assigtwo{
	public static void main(String args[]){
		short number = 334;
		String s = Short.toString(number);
		System.out.println(s);
		
	}
} */

/*
e. Declare a method-local variable strNumber of type String with some value and convert it to a short value using the parseShort method. (Hint: Use Short.parseShort(String)).
*/

/* class Assigtwo{
	public static void main(String args[]){
		String strNumber = "3345";
		Short s = Short.parseShort(strNumber);
		System.out.println(s);
		
	}
}
 */

/*
f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a short value. 
(Hint: parseShort method will throw a NumberFormatException).
*/

/* class Assigtwo{
	public static void main(String args[]){
		String strNumber = "Ab12Cd3";
		Short s = Short.parseShort(strNumber);
		System.out.println(s);
		
	}
} */

/*
g. Declare a method-local variable number of type short with some value and convert it to the corresponding wrapper class using Short.valueOf(). 
(Hint: Use Short.valueOf(short)).
*/

/* class Assigtwo{
	public static void main(String args[]){
		Short number = 4378;
		Short s = Short.valueOf(number);
		System.out.println(s);
		
	}
}
 */

/*
h. Declare a method-local variable strNumber of type String with some short value and convert it to the corresponding wrapper class using Short.valueOf(). 
(Hint: Use Short.valueOf(String)).
*/

/* class Assigtwo{
	public static void main(String args[]){
		String strNumber = "4378";
		Short s = Short.valueOf(strNumber);
		System.out.println(s);
		
	}
} */

/*
i. Experiment with converting a short value into other primitive types or vice versa and observe the results.

*/

/* class Assigtwo{
	public static void main(String args[]){
		Short number = 4378;
		long s = number;
		System.out.println(s);
		
	}
} */

/* class Assigtwo{
	public static void main(String args[]){
		float number = 4378.3f;
		short s = (short)number;
		System.out.println(s);
		
	}
}
 */

/*
4. Working with java.lang.Integer
a. Explore the Java API documentation for java.lang.Integer and observe its modifiers and super types.
b. Write a program to test how many bytes are used to represent an int value using the BYTES field. (Hint: Use Integer.BYTES).
c. Write a program to find the minimum and maximum values of int using the MIN_VALUE and MAX_VALUE fields. (Hint: Use Integer.MIN_VALUE and Integer.MAX_VALUE).
d. Declare a method-local variable number of type int with some value and convert 
it to a String using the toString method. (Hint: Use Integer.toString(int)).

*/

/* class Assigtwo{
	public static void main(String args[]){
		System.out.println(Integer.BYTES);
		
	}
}
 */

/* class Assigtwo{
	public static void main(String args[]){
		int number = 1234;
		String s = Integer.toString(number);
		System.out.println(s);
			
	}
}
 */

/*
e. Declare a method-local variable strNumber of type String with some value and convert it to an int value 
using the parseInt method. (Hint: Use Integer.parseInt(String)).

*/

/* class Assigtwo{
	public static void main(String args[]){
		String strNumber = "1234";
		int s = Integer.parseInt(strNumber);
		System.out.println(s);
			
	}
}
 */

/*
f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to an int value. 
(Hint: parseInt method will throw a NumberFormatException).
*/

/* class Assigtwo{
	public static void main(String args[]){
		String strNumber = "Ab12Cd3";
		int s = Integer.parseInt(strNumber);
		System.out.println(s);
			
	}
}
 */

/*

g. Declare a method-local variable number of type int with some value and convert it to the corresponding wrapper class using Integer.valueOf(). 
(Hint: Use Integer.valueOf(int)).

h. Declare a method-local variable strNumber of type String with some integer value and convert it to the corresponding wrapper class using Integer.valueOf(). 
(Hint: Use Integer.valueOf(String)).

*/

/* class Assigtwo{
	public static void main(String args[]){
		int number = 2345;
		int s = Integer.valueOf(number);
		System.out.println(s);
			
	}
} */

/* class Assigtwo{
	public static void main(String args[]){
		String strNumber = "23457";
		int s = Integer.valueOf(strNumber);
		System.out.println(s);
			
	}
}
 */

/*

i. Declare two integer variables with values 10 and 20, and add them using a method from the Integer class. 
(Hint: Use Integer.sum(int, int)).

j. Declare two integer variables with values 10 and 20, and find the minimum and maximum values using the Integer class. 
(Hint: Use Integer.min(int, int) and Integer.max(int, int)).

*/

/* class Assigtwo{
	public static void main(String args[]){
		int a =10, b=20;
		System.out.println(Integer.sum(a,b));
			
	}
}
 */

/* class Assigtwo{
	public static void main(String args[]){
		int a =10, b=20;
		System.out.println(Integer.min(a,b));
		System.out.println(Integer.max(a,b));			
	}
}
 */

/*
k. Declare an integer variable with the value 7. Convert it to binary, octal, and hexadecimal strings 
using methods from the Integer class. (Hint: Use Integer.toBinaryString(int), Integer.toOctalString(int), and Integer.toHexString(int)).

l. Experiment with converting an int value into other primitive types or vice versa and observe the results.
*/

/* class Assigtwo{
	public static void main(String args[]){
		int a =7;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toOctalString(a));			
		System.out.println(Integer.toHexString(a));
	}
}
 */

/* class Assigtwo{
	public static void main(String args[]){
		int a =7;
		long l=a;
		System.out.println(l);
	}
} */

/* class Assigtwo{
	public static void main(String args[]){
		int a =7;
		short s=(short)a;
		System.out.println(s);
	}
} */

/*
5. Working with java.lang.Long

a. Explore the Java API documentation for java.lang.Long and observe its modifiers and super types.
b. Write a program to test how many bytes are used to represent a long value using the BYTES field. (Hint: Use Long.BYTES).

c. Write a program to find the minimum and maximum values of long using the MIN_VALUE and MAX_VALUE fields. (Hint: Use Long.MIN_VALUE and Long.MAX_VALUE).

d. Declare a method-local variable number of type long with some value and convert it to a String using the toString method. (Hint: Use Long.toString(long)).


*/

/* class Assigtwo{
	public static void main(String args[]){
		System.out.println(Long.BYTES);
		
	}
} */

/* class Assigtwo{
	public static void main(String args[]){
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);		
	}
} */


/* class Assigtwo{
	public static void main(String args[]){
		long number = 1234;
		String s = Long.toString(number);
		System.out.println(s);
			
	}
}
 */

/*

e. Declare a method-local variable strNumber of type String with some value and convert it to a long value using the parseLong method. 
(Hint: Use Long.parseLong(String)).

f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a long value. 
(Hint: parseLong method will throw a NumberFormatException).

g. Declare a method-local variable number of type long with some value and convert it to the corresponding wrapper class using Long.valueOf(). 
(Hint: Use Long.valueOf(long)).


*/

/* class Assigtwo{
	public static void main(String args[]){
		String strNumber = "1234";
		long s = Long.parseLong(strNumber);
		System.out.println(s);
			
	}
}
 */


/* class Assigtwo{
	public static void main(String args[]){
		String strNumber = "Ab12Cd3";
		long s = Long.parseLong(strNumber);
		System.out.println(s);
			
	}
}
 */


/* class Assigtwo{
	public static void main(String args[]){
		long number = 2345;
		long s = Long.valueOf(number);
		System.out.println(s);
			
	}
} */

/*
h. Declare a method-local variable strNumber of type String with some long value and convert it to the corresponding wrapper class using Long.valueOf(). 
(Hint: Use Long.valueOf(String)).

i. Declare two long variables with values 1123 and 9845, and add them using a method from the Long class. 
(Hint: Use Long.sum(long, long)).

j. Declare two long variables with values 1122 and 1123, and find the minimum and maximum values using the Long class. 
(Hint: Use Long.min(long, long) and Long.max(long, long)).


*/


/* class Assigtwo{
	public static void main(String args[]){
		String strNumber = "2345745";
		long s = Long.valueOf(strNumber);
		System.out.println(s);
			
	}
} */

/* class Assigtwo{
	public static void main(String args[]){
		long a =1123, b=1123;
		System.out.println(Long.sum(a,b));
			
	}
} */


/* class Assigtwo{
	public static void main(String args[]){
		int a =1122, b=1123;
		System.out.println(Long.min(a,b));
		System.out.println(Long.max(a,b));			
	}
}
 */

/*

k. Declare a long variable with the value 7. Convert it to binary, octal, and hexadecimal strings using methods from the Long class. 
(Hint: Use Long.toBinaryString(long), Long.toOctalString(long), and Long.toHexString(long)).

l. Experiment with converting a long value into other primitive types or vice versa and observe the results.

*/



/* class Assigtwo{
	public static void main(String args[]){
		int a =7;
		System.out.println(Long.toBinaryString(a));
		System.out.println(Long.toOctalString(a));			
		System.out.println(Long.toHexString(a));
	}
} */


/* class Assigtwo{
	public static void main(String args[]){
		long a =7;
		double l=a;
		System.out.println(l);
	}
} */

/* class Assigtwo{
	public static void main(String args[]){
		long a =7;
		byte s=(byte)a;
		System.out.println(s);
	}
} */


/*
6. Working with java.lang.Float
a. Explore the Java API documentation for java.lang.Float and observe its modifiers and super types.
b. Write a program to test how many bytes are used to represent a float value using the BYTES field. (Hint: Use Float.BYTES).
c. Write a program to find the minimum and maximum values of float using the MIN_VALUE and MAX_VALUE fields. 
(Hint: Use Float.MIN_VALUE and Float.MAX_VALUE).

d. Declare a method-local variable number of type float with some value and convert it to a String using the toString method. 
(Hint: Use Float.toString(float)).

e. Declare a method-local variable strNumber of type String with some value and convert it to a float value using the parseFloat method. 
(Hint: Use Float.parseFloat(String)).

f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a float value. 
(Hint: parseFloat method will throw a NumberFormatException).
g. Declare a method-local variable number of type float with some value and convert it to the corresponding wrapper class using Float.valueOf(). 
(Hint: Use Float.valueOf(float)).

h. Declare a method-local variable strNumber of type String with some float value and convert it to the corresponding wrapper class using 
Float.valueOf(). (Hint: Use Float.valueOf(String)).

i. Declare two float variables with values 112.3 and 984.5, and add them using a method from the Float class. 
(Hint: Use Float.sum(float, float)).

j. Declare two float variables with values 112.2 and 556.6, and find the minimum and maximum values using the Float class. 
(Hint: Use Float.min(float, float) and Float.max(float, float)).

k. Declare a float variable with the value -25.0f. Find the square root of this value. 
(Hint: Use Math.sqrt() method).

l. Declare two float variables with the same value, 0.0f, and divide them. 
(Hint: Observe the result and any special floating-point behavior).

m. Experiment with converting a float value into other primitive types or vice versa and observe the results.

*/

/* class Assigtwo{
	public static void main(String args[]){
		System.out.println(Float.BYTES);
		
	}
} */

/* class Assigtwo{
	public static void main(String args[]){
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);		
	}
} */


/* class Assigtwo{
	public static void main(String args[]){
		float number = 123.4f;
		String s = Float.toString(number);
		System.out.println(s);
			
	}
}
 */



/* class Assigtwo{
	public static void main(String args[]){
		String strNumber = "123.4f";
		float s = Float.parseFloat(strNumber);
		System.out.println(s);
			
	}
}
 */


/* class Assigtwo{
	public static void main(String args[]){
		String strNumber = "Ab12Cd3";
		float s = Float.parseFloat(strNumber);
		System.out.println(s);
			
	}
}
 */



/* class Assigtwo{
	public static void main(String args[]){
		float number = 23.45f;
		float s = Float.valueOf(number);
		System.out.println(s);
			
	}
}
 */


/* class Assigtwo{
	public static void main(String args[]){
		String strNumber = "23457.45f";
		float s = Float.valueOf(strNumber);
		System.out.println(s);
			
	}
}
 */

/* class Assigtwo{
	public static void main(String args[]){
		float a =112.3f, b=984.5f;
		System.out.println(Float.sum(a,b));
			
	}
} */


/* class Assigtwo{
	public static void main(String args[]){
		float a =112.2f, b=556.6f;
		System.out.println(Float.min(a,b));
		System.out.println(Float.max(a,b));			
	}
} */




/* class Assigtwo{
	public static void main(String args[]){
		float a =-25.0f;
		System.out.println(Math.sqrt(a));
	}
}
 */

/* class Assigtwo{
	public static void main(String args[]){
		float a =0.0f;
		float l=0.0f;
		System.out.println(a/l);
	}
} */

// (Hint: Observe the result and any special floating-point behavior). ****

/* class Assigtwo{
	public static void main(String args[]){
		float a =7.2f;
		double s=a;
		System.out.println(s);
	}
} */

/* class Assigtwo{
	public static void main(String args[]){
		float a =7.2f;
		byte s=(byte)a;
		System.out.println(s);
	}
}
 */



/*
7. Working with java.lang.Double
a. Explore the Java API documentation for java.lang.Double and observe its modifiers and super types.
b. Write a program to test how many bytes are used to represent a double value using the BYTES field. (Hint: Use Double.BYTES).
c. Write a program to find the minimum and maximum values of double using the MIN_VALUE and MAX_VALUE fields. 
(Hint: Use Double.MIN_VALUE and Double.MAX_VALUE).

d. Declare a method-local variable number of type double with some value and convert it to a String using the toString method. 
(Hint: Use Double.toString(double)).

e. Declare a method-local variable strNumber of type String with some value and convert it to a double value using the parseDouble method. 
(Hint: Use Double.parseDouble(String)).

f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a double value. 
(Hint: parseDouble method will throw a NumberFormatException).

g. Declare a method-local variable number of type double with some value and convert it to the corresponding wrapper class using Double.valueOf(). 
(Hint: Use Double.valueOf(double)).

h. Declare a method-local variable strNumber of type String with some double value and convert it to the corresponding wrapper class using 
Double.valueOf(). (Hint: Use Double.valueOf(String)).

i. Declare two double variables with values 112.3 and 984.5, and add them using a method from the Double class. 
(Hint: Use Double.sum(double, double)).

j. Declare two double variables with values 112.2 and 556.6, and find the minimum and maximum values using the Double class. 
(Hint: Use Double.min(double, double) and Double.max(double, double)).

k. Declare a double variable with the value -25.0. Find the square root of this value. 
(Hint: Use Math.sqrt() method).

l. Declare two double variables with the same value, 0.0, and divide them. 
(Hint: Observe the result and any special floating-point behavior).

m. Experiment with converting a double value into other primitive types or vice versa and observe the results.
*/

/* class Assigtwo{
	public static void main(String args[]){
		System.out.println(Double.BYTES);
		
	}
} */

/* class Assigtwo{
	public static void main(String args[]){
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);		
	}
} */


/* class Assigtwo{
	public static void main(String args[]){
		double number = 123.454d;
		String s = Double.toString(number);
		System.out.println(s);
			
	}
} */



/* class Assigtwo{
	public static void main(String args[]){
		String strNumber = "123.478d";
		Double s = Double.parseDouble(strNumber);
		System.out.println(s);
			
	}
} */



/* class Assigtwo{
	public static void main(String args[]){
		String strNumber = "235345.879d";
		double s = Double.parseDouble(strNumber);
		System.out.println(s);
			
	}
}
 */
 
/*  class Assigtwo{
	public static void main(String args[]){
		String strNumber = "Ab12Cd3";
		double s = Double.parseDouble(strNumber);
		System.out.println(s);
			
	}
}
 */


/* class Assigtwo{
	public static void main(String args[]){
		double number = 236.457d;
		Double s = Double.valueOf(number);
		System.out.println(s);
			
	}
} */



/* class Assigtwo{
	public static void main(String args[]){
		String strNumber = "23457.4574d";
		double s = Double.valueOf(strNumber);
		System.out.println(s);
			
	}
}
 */

/* class Assigtwo{
	public static void main(String args[]){
		double a =112.3, b=984.5;
		System.out.println(Double.sum(a,b));
			
	}
} */


/* class Assigtwo{
	public static void main(String args[]){
		double a =112.2, b=556.6;
		System.out.println(Double.min(a,b));
		System.out.println(Double.max(a,b));			
	}
} */


/* class Assigtwo{
	public static void main(String args[]){
		double a =-25.0;
		System.out.println(Math.sqrt(a));
	}
} */


/* class Assigtwo{
	public static void main(String args[]){
		double a =0.0;
		double l =0.0;
		System.out.println(a/l);
	}
} */

// (Hint: Observe the result and any special floating-point behavior). ****

/* class Assigtwo{
	public static void main(String args[]){
		double a =747.32d;
		long s=(long)a;
		System.out.println(s);
	}
} */

/* class Assigtwo{
	public static void main(String args[]){
		double a =145.672d;
		byte s=(byte)a;
		System.out.println(s);
	}
} */

/*

8. Conversion between Primitive Types and Strings
Initialize a variable of each primitive type with a user-defined value and convert it into String:
        ◦ First, use the toString method of the corresponding wrapper class. (e.g., Integer.toString()).
        ◦ Then, use the valueOf method of the String class. (e.g., String.valueOf()).



*/

/* class Assigtwo{
	public static void main(String args[]){
		
		boolean a= true;
		//String i = Boolean.toString(a);
		String i = String.valueOf(a);
		byte b = 12;
		//String j = Byte.toString(b);
		String j = String.valueOf(b);
		char c = 67;
		//String k = Character.toString(c);
		String k = String.valueOf(c);
		short d= 157;
		//String l = Short.toString(d);
		String l = String.valueOf(d);
		int e = 3423;
		//String m = Integer.toString(e);
		String m = String.valueOf(e);
		float f = 4564.56f;
		//String n = Float.toString(f);
		String n = String.valueOf(f);
		long g = -9223372036854775808L;
		String o = String.valueOf(g);
		//String o = Long.toString(g);
		double h =16645.672d;
		String p = String.valueOf(h);
		//String p = Double.toString(h);
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		System.out.println(p);
	
	}
}
 */

/*
9. Default Values of Primitive Types
Declare variables of each primitive type as fields of a class and check their default values. 
(Note: Default values depend on whether the variables are instance variables or static variables).


*/

/* class Var{
	
		boolean a;
		byte b;
		char c;
		short d;
		int e;
		float f;
		long g;
		double h;
	
}
class Assigtwo{
	public static void main(String args[]){
		Var v = new Var();
		
		System.out.println(v.a);
		System.out.println(v.b);
		System.out.println(v.c);
		System.out.println(v.d);
		System.out.println(v.e);
		System.out.println(v.f);
		System.out.println(v.g);
		System.out.println(v.h);
	
	}
}
 */

/* class Var{
	
		static boolean a;
		static byte b;
		static char c;
		static short d;
		static int e;
		static float f;
		static long g;
		static double h;
	
}

class Assigtwo{
	public static void main(String args[]){
		
		System.out.println(Var.a);
		System.out.println(Var.b);
		System.out.println(Var.c);
		System.out.println(Var.d);
		System.out.println(Var.e);
		System.out.println(Var.f);
		System.out.println(Var.g);
		System.out.println(Var.h);
	
	}
}
 */

/*

10. Arithmetic Operations with Command Line Input
Write a program that accepts two integers and an arithmetic operator (+, -, *, /) from the command line. 
Perform the specified arithmetic operation based on the operator provided. (Hint: Use switch-case for operations).


*/

/* import java.util.Scanner;

class Assigtwo{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two integers: ");
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println("Enter the operation to perform (+, -, *, /): ");
		char c = s.next().charAt(0);
		switch(c){
			case '+':
				System.out.println("Sum: "+(a+b));
				break;
			case '-':
				System.out.println("Substraction: "+(a-b));
				break;
			case '*':
				System.out.println("Multiplication: "+(a*b));
				break;
			case '/':
				System.out.println("Sum: "+(a/b));
				break;
		}
				
	}
	
}
 */

