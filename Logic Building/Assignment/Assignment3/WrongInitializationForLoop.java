public class WrongInitializationForLoop {
public static void main(String[] args) {
for (int i = 10; i >= 0; i--) { // i--
System.out.println(i);
}
}
}

/*

Error to investigate: Why does this loop not print numbers in the expected 
order? What is the problem with the INITIALIZATION and update statements in 
the `for` loop?

instead of increment we should decrement

*/

