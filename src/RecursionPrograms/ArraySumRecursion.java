package RecursionPrograms;

/**
 * Logic: Sum = current element + sum of the remaining array elements.
 * Base Case: When the index reaches the array length, return 0.
 * Goal: Traverse an array without using loops.
 */
public class ArraySumRecursion {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        
        // Starting from index 0
        int totalSum = calculateSum(numbers, 0);
        
        System.out.println("Array Elements: ");
        printArray(numbers);
        System.out.println("Total Sum (Recursive): " + totalSum);
    }

    public static int calculateSum(int[] arr, int index) {
        // Base Case: Stop when we go past the last element
        if (index == arr.length) {
            return 0;
        }
        
        // Recursive Case: current element + sum of rest
        return arr[index] + calculateSum(arr, index + 1);
    }

    private static void printArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
