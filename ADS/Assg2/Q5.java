/*
5. Reverse Array in Place
Problem: Write a Java program to reverse an array in place.
*/

import java.util.Scanner;

public class Q5 {
    public static void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        reverseArray(arr);
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*

C:\Users\91916\Downloads\Assg2_M>java Q5
4
1
2
3
4
4 3 2 1
C:\Users\91916\Downloads\Assg2_M>java Q5
3
7
8
9
9 8 7

*/

