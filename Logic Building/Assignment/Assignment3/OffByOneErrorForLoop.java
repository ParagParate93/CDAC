public class OffByOneErrorForLoop {
public static void main(String[] args) {
for (int i = 1; i < 10; i++) {  // removed =
System.out.println(i);
}
// Expected: 10 iterations with numbers 1 to 10
// Actual: Prints numbers 1 to 10, but the task expected only 1 to 9
}
}

/*

Error to investigate: What is the issue with the loop boundaries? How should 
the loop be adjusted to meet the expected output?

as we only want to print till 9 in the condition of for loop i should be less 
than 10 and not <= 10.

*/

