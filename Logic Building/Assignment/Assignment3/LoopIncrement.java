public class LoopIncrement {
public static void main(String[] args) {
int count = 0;
for (int i = 0; i < 4; i++) {
count += i++ - ++i;
}
System.out.println(count);
}
}

/* 
Guess the output of this code snippet.
dry run
count  i        count = count + i++ - ++i   o/p
0      0,1,2       0+0-2 = -2
-2     3,4,5       -2+3-5 = -4
-4                                           -4  

*/

