package ArrayPrograms;

import java.util.Arrays;

public class MergeSortedArrays {
    
    public static int[] merge(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] mergedResult = new int[n1 + n2];
        
        int i = 0; // Pointer for arr1
        int j = 0; // Pointer for arr2
        int k = 0; // Pointer for result array

        // Logic: Compare elements from both arrays and pick the smaller one
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                mergedResult[k++] = arr1[i++];
            } else {
                mergedResult[k++] = arr2[j++];
            }
        }

        // Logic: If there are leftover elements in arr1, add them
        while (i < n1) {
            mergedResult[k++] = arr1[i++];
        }

        // Logic: If there are leftover elements in arr2, add them
        while (j < n2) {
            mergedResult[k++] = arr2[j++];
        }

        return mergedResult;
    }

    public static void main(String[] args) {
        int[] listA = {1, 3, 5, 7};
        int[] listB = {2, 4, 6, 8, 10};

        int[] result = merge(listA, listB);
        
        System.out.println("Array A: " + Arrays.toString(listA));
        System.out.println("Array B: " + Arrays.toString(listB));
        System.out.println("Merged Sorted Array: " + Arrays.toString(result));
    }
}
