//Snippet 25:

/* public class Switch {
public static void main(String[] args) {
int score = 85;
switch(score) {
case 100:
System.out.println("Perfect score!");
break;
case 85:
System.out.println("Great job!");
break;
default:
System.out.println("Keep trying!");
}
}
} */

/*

Error to Investigate: Why does this code not compile? What does the error tell you 
about the types allowed in switch expressions? How can you modify the code to make 
it work?

Switch.java:6: error: patterns in switch statements are a preview feature and are disabled by default.
switch(score) {
      ^
  (use --enable-preview to enable patterns in switch statements)
Switch.java:7: error: constant label of type int is not compatible with switch selector type double
case 100:
     ^
Switch.java:10: error: constant label of type int is not compatible with switch selector type double
case 85:
     ^
3 errors

The error tells that double type expressions are not allowed in switch statements. 
There are only four types of data types allowed in switch case statements. They are 
char, short, int, and byte. Replace the double by int in the code.

*/

//Snippet 26:

public class Switch {
public static void main(String[] args) {
int number = 5;
switch(number) {
case 5:
System.out.println("Number is 5");
break;
case 5: 
System.out.println("This is another case 5");
break;
default:
System.out.println("This is the default case");
}
}
}

/*
Error to Investigate: Why does the compiler complain about duplicate case labels? 
What happens when you have two identical case labels in the same switch block?

 error: duplicate case label
case 5:
^
1 error

The compiler is complaining about same values have been passed in both the cases 
due to which it is unable to decide the values to print. 


*/

