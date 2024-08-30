/*
public class Main {
public static void main(String[] args) {
System.out.println("Hello, World!");
}
}
*/

/*
What error do you get when running this code?

error: 'main' method is not declared 'public static'

The main() method should be declared static so that the JVM 
(Java Virtual Machine) can call it without having to create 
an instance of the class containing the main() method. 
An instance of a class in java is the object of that class itself. 
It is sometimes referred to as a class instance or a class object. 
An instance is a single object of a specific class. 
For example, an object obj that belongs to the class Circle is an
 instance (object) of the class Circle.
 
 Anything specified in a Java class is of the reference type and must
 be generated before being used. At the same time, static methods and 
 static data are loaded into a separate memory inside the JVM called 
 context, which is created when a class is loaded. The JVM context will 
 load the main method if it is static, making it available for execution.
 */

/* 
public class Main {
public static void main(String[] args) {
System.out.println("Hello, World!");
}
}
*/ 
 
 /*
What happens when you compile and run this code?

error: 'main' method is not declared 'public static'

It is an Access modifier, which specifies from where and who can access 
the method. Making the main() method public makes it globally available. 
It is made public so that JVM can invoke it from outside the class as it 
is not present in the current class.
If the main method is not public, it’s access is restricted.
 */
 
 
/* 
public class Main {
public static void main(String[] args) {
System.out.println("Hello, World!");
}
}
*/

/*
What error do you encounter? Why is void used in the main method?

error: 'main' method is not declared with a return type of 'void'

It is a keyword and is used to specify that a method doesn’t return 
anything. As the main() method doesn’t return anything, its return type 
is void. As soon as the main() method terminates, the Java program 
terminates too. Hence, it doesn’t make any sense to return from the 
main() method as JVM can’t do anything with its return value.
*/ 

/*
public class Main {
public static void main(String args[]) {
System.out.println("Hello, World!");
}
}
*/


/*

What happens when you compile and run this code? Why is String[] args 
needed?

error: can't find main(String[]) method in class: Main

String[]args in Java, i.e., a command line argument array, is used in Java 
to retrieve input from the console.

In Java args contains the supplied command-line arguments as an array of 
String objects. In other words, if you run your program in your terminal 
as :

C:/ java MyProgram one two
then args will contain ["one", "two"].

If you wanted to output the contents of args, you can just loop through 
them like this...

public class ArgumentExample {
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
The program will print in the terminal:

C:/ java MyProgram one two
one
two
    
C:/

*/

/*
public class Main {
public static void main(String[] args) {
System.out.println("Main method with String[] args");
int[] i = new int[1];
main(i);
}
public static void main(int[] args) {
System.out.println("Overloaded main method with int[] args");
}
}
*/

/*

Can you have multiple main methods? What do you observe?

Only the main() method with a single string array as a parameter is 
considered as an entry point of the program. JVM only looks for main 
method with string array as an argument. In order for other main methods 
to execute, you need to call them from inside  public static void 
main(String[ ] args)

 Java can have multiple main methods but with the concept of overloading. 
 There should be only one main method with parameter as string[ ] arg. 


Ref: https://www.geeksforgeeks.org/can-we-have-multiple-main-methods-in-java/


*/

/*
public class Main {
public static void main(String[] args) {
int y = 2; //variable declaration and initilisation was missing.
int x = y + 10;
System.out.println(x);
}
}
*/


/*

What error occurs? Why must variables be declared?

error: cannot find symbol
int x = y + 10;
        ^
  symbol:   variable y
  location: class Main
  
The Cannot Find Symbol in Java is a compilation error that occurs when we refer to 
something not present in the Java Symbol Table. A common example of this error is 
using a variable not declared in the program.

Java compilers create and maintain Symbol tables. The symbol table stores information 
about the identifiers, i.e., classes, interfaces, variables, and methods in the given 
source of code. When we use these identifiers in our code, the compiler looks to the 
symbol table for information. If the identifier is not declared or is not present in the 
given scope, the compiler throws 'Cannot Find Symbol'.

In Java, Variables are the data containers that save the data values during Java 
program execution. Every Variable in Java is assigned a data type that designates the 
type and quantity of value it can hold. A variable is a memory location name for the 
data.

*/


/* public class Main {
public static void main(String[] args) {
//int x = "Hello";
String x = "Hello"; // corrected type
System.out.println(x);
}
} */

/*
What compilation error do you see? Why does Java enforce type safety?

error: incompatible types: String cannot be converted to int
int x = "Hello";

Compile-Time Errors
When the code is converted to bytecode during compilation, compile-time 
mistakes can happen.

A type mismatch causes the error at the line int x = "Hello";. Despite being 
declared as an int (integer), the variable x is attempted to be assigned a string 
literal ("Hello").

The Java language is designed to enforce type safety. This means that 
programs are prevented from accessing memory in inappropriate ways. More 
specifically, every piece of memory is part of some Java object. Each object 
has some class. For example, a calendar-management applet might use classes 
like Date, Appointment, Alarm, and GroupCalendar. Each class defines both a 
set of objects and operations to be performed on the objects of that class. 
In our calendar management example, the Alarm class might define a turnOn 
operation, but the Date class would neither need nor allow turnOn. Type 
safety means that a program cannot perform an operation on an object unless 
that operation is valid for that object.

Every Java object is stored in some region of the computer's memory. Java
 labels every object by putting a class tag next to the object. One simple 
 way to enforce type safety is to check the class tag of the object before 
 every operation on the object. This will help make sure the object's class 
 allows the operation. This approach is called dynamic type checking.



*/

/* public class Main {
public static void main(String[] args) {
System.out.println("Hello, World!");
}
} */

/*
What syntax errors are present? How do they affect compilation?
error: ')' expected
error: ';' expected

When the Java compiler encounters syntax errors in a program, it prevents 
the code from compiling successfully and will not create a . class file 
until errors are corrected.

*/


/* public class Main {
public static void main(String[] args) {
int num = 10; //corrected
System.out.println(num); //corrected
}
} 
 */
 
/*
What error occurs? Why can't reserved keywords be used as identifiers?

error: not a statement

Reserved words have predefined meanings in the language's syntax and using 
them as identifiers would lead to confusion and syntax errors.

There are 51 reserved terms or keywords in Java.
https://www.javatpoint.com/java-reserved-keywords


*/

/* public class Main {
public static void display() { // added static
System.out.println("No parameters");
}
public static void display(int num) { // added static 
System.out.println("With parameter: " + num);
}
public static void main(String[] args) {
display();
display(5);
}
} */

/*
What happens when you compile and run this code? Is method overloading 
allowed?


Main.java:279: error: non-static method display() cannot be referenced 
from a static context
display();
^
Main.java:280: error: non-static method display(int) cannot be referenced 
from a static context
display(5);

In Java, the keyword static is used to declare elements that belong to the 
class rather than instances. Static members are shared among all instances 
of a class and can be accessed without creating an object of the class.

However, on the other hand, non-static methods are associated with instances 
of a class and cannot be invoked without creating an object. They can rely 
on the specific state of an object, and their behavior may vary depending on 
the values of instance variables.

The compilation error Non-static method … cannot be referenced from a static
 context occurs when an attempt is made to call a non-static method from a 
 static context. This static context could be a static method, a static 
 block, or the main() method, which is always static.


*/


//Snippet 11:

/* public class Main {
public static void main(String[] args) {
int[] arr = {1, 2, 3};
System.out.println(arr[1]); // allowed values for index are 0, 1, 2
}
} */

/*
What runtime exception do you encounter? Why does it occur?
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
        at Main.main(Main.java:320)
		
ArrayIndexOutOfBoundsException occurs when we access an array, or a Collection, 
that is backed by an array with an invalid index. This means that the index is 
either less than zero or greater than or equal to the size of the array.

Additionally, bound checking happens at runtime. So, ArrayIndexOutOfBoundsException
 is a runtime exception. Therefore, we need to be extra careful when accessing the 
 boundary elements of an array.

Ref: https://www.baeldung.com/java-arrayindexoutofboundsexception
*/

//Snippet 12:

/* public class Main {
public static void main(String[] args) {
	boolean i = true; // added
while (i) { // i added
System.out.println("Infinite Loop");
i = false; // set i to false to stop loop
}
}
}
 */

/*

What happens when you run this code? How can you avoid infinite loops?

Infinite Loop is printed infinitely. To avoid infinite loop the condition in while 
loop should evaluate to false.


*/

//Snippet 13:

/* public class Main {
public static void main(String[] args) {
String str = "parag"; // changed from null to a string value
System.out.println(str.length());
}
}
 */
 
/*

 What exception is thrown? Why does it occur?
 Exception in thread "main" java.lang.NullPointerException: Cannot invoke 
 "String.length()" because "<local1>" is null
        at Main.main(Main.java:368)
 
The NullPointerException occurs when an uninitialized variable is used. Such a 
variable has no object reference and does not point anywhere. Therefore, it has a 
null value in Java and using it throws a NullPointerException.

Some of the most common scenarios for a NullPointerException are:

Calling methods on a null object **CASE HERE
Accessing a null object’s properties
Accessing an index element (like in an array) of a null object
Passing null parameters to a method
Incorrect configuration for dependency injection frameworks like Spring
Using synchronized on a null object
Throwing null from a method that throws an exception

 */


// Snippet 14:


/* public class Main {
public static void main(String[] args) {
double num = 16.03; // changed "Hello"
System.out.println(num);
}
} */


/*

What compilation error occurs? Why does Java enforce data type constraints?

Main.java:402: error: incompatible types: String cannot be converted to double
double num = "Hello";

While it is possible to convert to and from certain types with relative ease, like 
converting a char to an int and vice versa with type casting [2], it is not very 
straightforward to convert between other types, such as between certain primitive 
and reference types, like converting a String to an int, or one user-defined type 
to another. In fact, many of these cases would be indicative of a logical error 
and require careful consideration as to what is being converted and how, or whether 
the conversion is warranted in the first place.

The incompatible types error indicates a situation where there is some expression 
that yields a value of a certain data type different from the one expected. This 
error implies that the Java compiler is unable to resolve a value assigned to a 
variable or returned by a method, because its type is incompatible with the one 
declared on the variable or method in question. Incompatible, in this context, 
means that the source type is both different from and unconvertible (by means of 
automatic type casting) to the declared type.

Ref: https://rollbar.com/blog/how-to-handle-the-incompatible-types-error-in-java/

These annotations are typically used to improve code readability and catch 
type-related errors at compile time. 

*/


//Snippet 15:

/* public class Main {
public static void main(String[] args) {
int num1 = 10;
double num2 = 5.5;
int result = num1 + (int)num2; // explicit type casting 
System.out.println(result);
}
} */

/*

What error occurs when compiling this code? How should you handle different data types
in operations?

Main.java:445: error: incompatible types: possible lossy conversion from double to 
int
int result = num1 + num2;

different data types in operations can be handled by 
1. Implicit Type Casting
2. Explicit type casting

*/


//Snippet 16:

/* public class Main {
public static void main(String[] args) {
int num = 10;
double result = num / 4;
System.out.println(result);
}
} */

/*
What is the result of this operation? Is the output what you expected?

The output of the program is 2.0. 

It is because both 10 and 4 are integers so the 
result of division is 2. Since we are storing this value into a variable of type 
double, therefore .0 gets added into it.

*/

//Snippet 17:

/* public class Main {
public static void main(String[] args) {
int a = 10;
int b = 5;
double result = Math.pow(a,b);
System.out.println(result);
}
}
 */

/*
100000.0

What compilation error occurs? Why is the ** operator not valid in Java?

error: illegal start of expression
int result = a ** b;

** operator is not recognised in java, Math.pow() method can be used for 
exponents in java

Why is the ** operator not valid in Java?
Because java is a simple language that does not include ambiguous stuffs like 
operator overloading , multiple inheritance, Etc. 

*/

//Snippet 18:

/* public class Main {
public static void main(String[] args) {
int a = 10;
int b = 5;
int result = a + b * 2;
System.out.println(result);
}
} */


/*

What is the output of this code? How does operator precedence affect the result?

20
BODMAS
The operators having higher precedence are evaluated first. If we want to evaluate 
lower precedence operators first, we must group operands by using parentheses and 
then evaluate.

*/

//Snippet 19:

/* public class Main {
public static void main(String[] args) {
float a = 10;
int b = 0;
float result = a / b;
System.out.println(result);
}
} */

/*

What runtime exception is thrown? Why does division by zero cause an issue in Java?

Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Main.main(Main.java:546)
		
integer division by zero throw an exception, while floating-point division by zero 
does not?

Let’s look at this from a memory representation perspective. For integers, there is 
no bit pattern that can be used to store the result of such an operation, while 
floating-point numbers have values like NaN or INFINITY to be used in cases like 
these.

Now, let’s consider the binary representation of a float as SEEEEEEE EFFFFFFF 
FFFFFFFF FFFFFFFF with one bit (S) for the sign, 8 bits (E) for the exponent, and 
the rest (F) for the mantissa.

In each of the three values NaN, POSITIVE_INFINITY, and NEGATIVE_INFINITY, 
all bits in the exponent part are set to 1.

INFINITY has the mantissa bits all set to 0, while NaN has a non-zero mantissa.

Ref: https://www.baeldung.com/java-division-by-zero#:~:text=To%20sum%20things%20up%2C%20in,double%2C%20Java%20allows%20the%20operation.
		
*/

//Snippet 20:

/* public class Main {
public static void main(String[] args) {
System.out.println("Hello, World");
}
} */

/*
What syntax error occurs? How does the missing semicolon affect compilation?

 error: ';' expected
System.out.println("Hello, World")

Every statement in a Java program must end with a semicolon.

Not every line of Java code is a statement. A class declaration is not considered 
a statement, so it is not followed by a semicolon. Likewise, a method declaration 
also is not considered a statement and requires no semicolon.

*/


//Snippet 21:

/* public class Main {
public static void main(String[] args) {
System.out.println("Hello, World!");
}// Missing closing brace here
} */

/*
What does the compiler say about mismatched braces?
 error: reached end of file while parsing
}
 ^
 
*/


//Snippet 22:

/* public class Main {
public static void main(String[] args) {
	displayMessage();
}

static void displayMessage() {  // method can't be declared inside other method but it can be called from other method. 
	System.out.println("Message");
	}
} */

/*
What syntax error occurs? Can a method be declared inside another method?

 error: illegal start of expression
static void displayMessage() {
^
Main.java:627: error: class, interface, enum, or record expected
}
^
2 errors

No, Java does not support directly nested methods like some other languages 
(e.g., Python). However, you can achieve similar functionality using the following 
approaches:
1. Local Classes (Java 7 and earlier): You can’t declare a metho directly within a 
method but you can declare a whole class within the scope of a method and that 
class can have as many methods as it likes.

2. Lambda Expressions (Java 8 and later):

*/



