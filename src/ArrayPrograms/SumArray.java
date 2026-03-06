package ArrayProgram;

import java.util.Arrays;

public class SumArray 
{
   public static void main(String [] args)
   {
//	  
	   int[] arr = {10, 20, 30, 40, 50};
       
       //  variable initialized to zero
       int sum = 0;

       // Traverse the array and add each element to sum
       for (int i = 0; i < arr.length; i++) {
           sum += arr[i]; // Same as: sum = sum + arr[i]
       }

       System.out.println("Array Elements: " + Arrays.toString(arr));
       System.out.println("Total Sum of Elements: " + sum);
   }

}
