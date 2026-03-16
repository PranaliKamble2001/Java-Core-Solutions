package SortingPrograms;

/**
 * Logic: Build the sorted array one item at a time by "inserting" 
 * the current element into its correct position.
 * Efficiency: O(n) for nearly sorted data, O(n^2) worst case.
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        int n = arr.length;

        System.out.println("Before Insertion Sort:");
        printArray(arr);

        // Insertion Sort Logic
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Move elements that are greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        System.out.println("\nAfter Insertion Sort:");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
