package SearchingPrograms;

/**
 * Logic: Checks every element one by one from start to end.
 * Complexity: O(n)
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {45, 12, 89, 7, 33};
        int target = 7;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
    }
}
