public class IncorrectWhileLoopControl {
public static void main(String[] args) {
int num = 10;
while (num == 10) {
System.out.println(num);
num--;
}
}
}

/*

Error to investigate: Why does the loop execute indefinitely? What is wrong 
with the loop condition?

loop condition was expecting a boolean value whereas it got integer value so error:
error: incompatible types: int cannot be converted to boolean

*/

