package SearchingPrograms;

/**
 * Logic: Divide and Conquer. It finds the middle element and 
 * eliminates half of the remaining array in every step.
 * Prerequisite: The array MUST be sorted.
 * Efficiency: O(log n) - Much faster than Linear Search for large data.
 */
public class BinarySearch {
    public static void main(String[] args) {
        // Must be a sorted array
        int[] arr = {10, 25, 30, 45, 50, 62, 70, 88, 99};
        int target = 62;
        
        int low = 0;
        int high = arr.length - 1;
        int foundIndex = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Prevents overflow for large arrays

            if (arr[mid] == target) {
                foundIndex = mid;
                break;
            }

            if (arr[mid] < target) {
                low = mid + 1; // Target is in the right half
            } else {
                high = mid - 1; // Target is in the left half
            }
        }

        if (foundIndex != -1) {
            System.out.println("Target " + target + " found at index: " + foundIndex);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
    }
}
