public class InfiniteForLoop {
public static void main(String[] args) {
for (int i = 0; i < 10; i++) {  // changed to i++
System.out.println(i);
}
}
} 

/* Error to investigate: Why does this loop run infinitely? How should the
 loop control variable be adjusted?

i should be incremented instead of decrementing so that it does not go into 
infinite loop.

*/
