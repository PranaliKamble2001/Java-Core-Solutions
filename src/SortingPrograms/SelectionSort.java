package SortingPrograms;

/**
 * Logic: Repeatedly finds the minimum element from the unsorted part
 * and puts it at the beginning.
 * Efficiency: O(n^2) - Good for small datasets.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13};
        int n = arr.length;

        System.out.println("Before Selection Sort:");
        printArray(arr);

        // Selection Sort Logic
        for (int i = 0; i < n - 1; i++) {
            // Assume the current index is the minimum
            int minIdx = i;
            
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j; // Found a smaller element
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }

        System.out.println("\nAfter Selection Sort:");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
