
public class IncorrectWhileCondition {
public static void main(String[] args) {
int count = 5;
while (count != 0) { // ! added
System.out.println(count);
count--;
}
}
}

/* 

Error to investigate: Why does the loop not execute as expected? What is the 
issue with the condition in the `while` loop?

 error: incompatible types: int cannot be converted to boolean
 
 The loop does not execute as expected because the condition written in while 
 loop evaluates to 0 which is an integer but the expectation here is to get a
 boolean value of true or false.
 

 */
 
 
