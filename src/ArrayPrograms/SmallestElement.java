package ArrayPrograms;

public class SmallestElement {
    public static void main(String[] args) {
        int[] arr = {25, 11, 7, 75, 56};
        
        if (arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        // Initialize min with the first element
        int min = arr[0];

        // Traverse array to find the minimum value
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        System.out.println("Smallest element in the given array: " + min);
    }
}
