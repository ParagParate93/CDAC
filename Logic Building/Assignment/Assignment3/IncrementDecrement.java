public class IncrementDecrement {
public static void main(String[] args) {
int x = 5;
int y = ++x - x-- + --x + x++;
System.out.println(y);
}
}

/*
Guess the output of this code snippet.
dry run
x                    y             o/p
5,6,5,4,5      6 - 6 + 4 + 4        8

*/

