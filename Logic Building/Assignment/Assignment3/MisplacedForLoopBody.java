public class MisplacedForLoopBody {
public static void main(String[] args) {
for (int i = 0; i < 5; i++){  // { added
System.out.println(i);
System.out.println("Done");
} // { added
}
}

/*

Why does "Done" print only once, outside the loop? How should the loop body 
be enclosed to include all statements within the loop?


*/

