public class UninitializedWhileLoop {
public static void main(String[] args) {
int count = 0;
while (count < 10) {
System.out.println(count);
count++;
}
}
}

/*
Error to investigate: Why does this code produce a compilation error? What 
needs to be done to initialize the loop variable properly?

error: variable count might not have been initialized

count variable has not been asigned any value so inside while condition 
there is nothing to compare with

int count = 0; added


*/

