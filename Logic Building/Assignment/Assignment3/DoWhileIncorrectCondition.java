public class DoWhileIncorrectCondition {
public static void main(String[] args) {
int num = 0;
do {
System.out.println(num);
num++;
} while (num < 0); //< added
}
}

/*

Error to investigate: Why does the LOOP ONLY EXECUTE ONCE? What is wrong 
with the loop condition in the dowhile loop?

due to the condition of num > 0 program was going into an infinite loop
after changing the condition to num < 0 program will only execute once


*/

