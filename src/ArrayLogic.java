// This module handles linear search operations for integer arrays.
/**
 * Project: Java Core Technical Solutions
 * Feature: Linear Search Logic
 */
public class ArrayLogic {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;
        boolean found = false;

        System.out.println("Starting Linear Search for: " + target);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Result: Element " + target + " found at index " + i);
                found = true;
                break; // Exit loop once found
            }
        }

        if (!found) {
            System.out.println("Result: Element not found in the array.");
        }
    }
}
