public class NestedIncrement {
public static void main(String[] args) {
int a = 10;
int b = 5;
int result = ++a * b-- - --a + b++;
System.out.println(result);
}
}

/*
Guess the output of this code snippet.
dry run
a           b                   result          o/p
10,11,10       5,4,5        11 * 5 - 10 + 4      49



*/