/*2. Remove Array Duplicates
Problem: Write a Java program to remove duplicates from a sorted array and return the new length of the array.
*/
import java.util.Scanner;

public class Q2 {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0; // Return 0 for an empty array
        }

        int uniqueIndex = 1; // Start from the second element

        // Loop through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // If the current element is different from the previous one
            if (nums[i] != nums[i - 1]) {
                // Move the unique element to the unique index
                nums[uniqueIndex] = nums[i];
                uniqueIndex++; // Increment the index for unique elements
            }
        }

        // Return the length of the array with unique elements
        return uniqueIndex;
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        // Call the method and get the new length
        int newLength = removeDuplicates(nums);

        // Print the new length
        System.out.println("Length after removing duplicates: " + newLength);

        // Print the unique elements
        System.out.print("Elements remaining after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

/*

C:\Users\91916\Downloads\Assg2_M>javac Q2.java

C:\Users\91916\Downloads\Assg2_M>java Q2
3
1
1
2
Length after removing duplicates: 2
Elements remaining after removing duplicates: 1 2
C:\Users\91916\Downloads\Assg2_M>java Q2
8
0
0
1
1
2
2
3
3
Length after removing duplicates: 4
Elements remaining after removing duplicates: 0 1 2 3

*/


