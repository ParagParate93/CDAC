/*
8. Array Manipulation
Problem: Perform a series of operations to manipulate an array based on range update queries. Each query adds a value to a range of indices.
*/

import java.util.*;

public class Q8 {

    public static long get(int n, int[][] queries) {
        long[] arr = new long[n + 1];

        for (int[] query : queries) { //  difference array technique for range update**
            int start = query[0] - 1;
            int end = query[1];
            int value = query[2];

            arr[start] += value;
            if (end < n) {
                arr[end] -= value;
            }
        }
		// arr = [100, 100, 0, -100, 0, -100]

        long max = Long.MIN_VALUE;
        long current = 0;

        for (int i = 0; i < n; i++) {
            current += arr[i];
            if (current > max) {
                max = current;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int n1 = 5;
        int[][] queries1 = {{1, 2, 100}, {2, 5, 100}, {3, 4, 100}};
        System.out.println(get(n1, queries1));  

        int n2 = 4;
        int[][] queries2 = {{1, 3, 50}, {2, 4, 70}};
        System.out.println(get(n2, queries2)); 
    }
}



/*
C:\Users\91916\Downloads\Assg2_M>javac Q8.java

C:\Users\91916\Downloads\Assg2_M>java Q8
200
120

*/

