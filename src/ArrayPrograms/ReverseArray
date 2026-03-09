package ArrayPrograms;

import java.util.Arrays;

/**
 * Logic: Reverse an array in-place using the two-pointer technique.
 * Efficiency: O(n) time complexity and O(1) space complexity.
 */
public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.println("Original Array: " + Arrays.toString(numbers));
        
        reverse(numbers);
        
        System.out.println("Reversed Array: " + Arrays.toString(numbers));
    }

    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            // Swap elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            // Move pointers toward the center
            start++;
            end--;
        }
    }
}
