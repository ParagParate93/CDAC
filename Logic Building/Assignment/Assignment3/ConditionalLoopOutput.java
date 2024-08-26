public class ConditionalLoopOutput {
public static void main(String[] args) {
int num = 1;
for (int i = 1; i <= 4; i++) {
if (i % 2 == 0) {
num += i;
} else {
num -= i;
}
}
System.out.println(num);
}
}

/*
Guess the output of this loop.
dry run

num   i  num=num+i   num = num-i   o/p
1     1    skip         0 
0     2      2 
2     3    skip        -1
-1    4     3
3     5                             3                                 

*/

