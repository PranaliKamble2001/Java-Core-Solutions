package ArrayProgram;

public class LargestElement 
{
   public static void main(String [] args)
   {
	   int arr[]= {25,11,7,75,56};
	   
	// Handle empty array case
	   if(arr.length==0)
	   {
		   System.out.println("Array is Empty");
		   
	   }
	// Initialize max with the first element of the array
	   int max=arr[0];
	// Traverse array elements from the second element
       for (int i = 1; i < arr.length; i++) {
           // Compare every element with current max
           if (arr[i] > max) {
               max = arr[i];
           }
       }
       System.out.println("Largest element in the given array: " + max);
   }
}
