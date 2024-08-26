public class DecrementingLoop {
public static void main(String[] args) {
int total = 0;
for (int i = 5; i > 0; i--) {
total += i;
if (i == 3) continue;
total -= 1;
}
System.out.println(total);
}
}

/*

Guess the output of this loop.
dry run

total   i   total    total    o/p
0       5   0+5= 5  5-1 = 4         
4       4   4+4= 8  8-1 = 7
7       3   7+3= 10 
10      2   10+2= 12 12-1=11
11      1   11+1= 12 12-1=11
11      0                      11


*/

