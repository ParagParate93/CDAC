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


