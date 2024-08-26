public class OffByOneDoWhileLoop {
public static void main(String[] args) {
int num = 5;
do {
System.out.println(num);
num--;
} while (num > 0);
}
}



/*
 Error to investigate: Why does this loop print unexpected numbers? What 
 adjustments are needed to print the numbers from 1 to 5?

change value of num from 1 to 5

*/

