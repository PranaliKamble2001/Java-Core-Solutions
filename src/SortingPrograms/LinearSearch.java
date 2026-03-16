package SearchingPrograms;

/**
 * Logic: Iterates through the array and compares each element with the target.
 * Efficiency: O(n) - Best for unsorted or small datasets.
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 50, 30, 70, 80, 60, 20, 90, 40};
        int target = 20;
        int result = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                result = i;
                break;
            }
        }

        if (result == -1) {
            System.out.println("Element not present in array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
