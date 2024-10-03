/*
10. Array Left Rotation
Problem: Write a Java program to rotate an array to the left by d positions.
*/

import java.util.Arrays;

public class Q10 {

    public static void rotateLeft(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
		// Temporary Array for Rotated Elements
        int[] temp = new int[d]; // A temporary array temp is created to hold the first d elements of arr
		
		//Copy Elements to Temporary Array
        for (int i = 0; i < d; i++) { //This loop copies the first d elements from arr into temp.
            temp[i] = arr[i];
        }
		
		// Shift Remaining Elements
        for (int i = 0; i < n - d; i++) { //This loop shifts the remaining elements of arr (from index d to n-1) to the left by d positions.
            arr[i] = arr[i + d];
        }

		//Place Temporary Elements Back
        for (int i = 0; i < d; i++) { // Finally, this loop places the elements stored in temp back into the end of arr, filling it in from index n - d to n - 1.
            arr[n - d + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int d1 = 2;
        rotateLeft(arr1, d1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {10, 20, 30, 40};
        int d2 = 1;
        rotateLeft(arr2, d2);
        System.out.println(Arrays.toString(arr2));
    }
}


/*
C:\Users\91916\Downloads\Assg2_M>javac Q10.java

C:\Users\91916\Downloads\Assg2_M>java Q10
[3, 4, 5, 1, 2]
[20, 30, 40, 10]
*/

