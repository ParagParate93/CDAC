//Snippet 23:

public class Confusion {
public static void main(String[] args) {
int value = 2;
switch(value) {
case 1:
System.out.println("Value is 1");
case 2:
System.out.println("Value is 2");
break; // added break so that next two cases are not printed.
case 3:
System.out.println("Value is 3");
default:
System.out.println("Default case");
}
}
}

/*
o/p

Value is 2
Value is 3
Default case

Error to Investigate: Why does the default case print after "Value is 2"? How can 
you prevent the program from executing the default case?

We can prevent the prog from executing the default case by adding break stmt..

*/
