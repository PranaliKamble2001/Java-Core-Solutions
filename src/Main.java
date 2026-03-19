/**
 * Project: Java Core Technical Solutions
 * Author: Pranali
 * Description: Entry point and status dashboard for technical portfolio.
 * Goal: Master Core Java Logic.
 */
public class Main {

    public static void main(String[] args) {
        printHeader();
        displayProjectStatus();
    }

    private static void printHeader() {
        System.out.println("==========================================");
        System.out.println("    JAVA TECHNICAL PORTFOLIO              ");
        System.out.println("==========================================");
    }

    private static void displayProjectStatus() {
        System.out.println("\n[Status]: Environment and Package Structure Verified.");
        System.out.println("[Roadmap]: Logic Mastery for April Professional Applications.");
        
        System.out.println("\n--- Current Modules in [src/ArrayPrograms] ---");
        System.out.println("1. FindDuplicate   - HashSet Implementation (O(n))");
        System.out.println("2. SecondLargest   - Single-pass Optimization");
        System.out.println("3. LargestElement  - Iterative Boundary Check");
        System.out.println("4. SmallestElement - Iterative Boundary Check");
        System.out.println("5. LinearSearch    - Target Element Localization");
        System.out.println("6. SumOfArray      - Arithmetic Accumulation");
        System.out.println("7. ReverseArray    - Two-Pointer In-place Swap");
        System.out.println("8. RotateArray     - Three-Step Reversal Optimal (O(n))"); 
        System.out.println("9. MergeSorted     - Two-Pointer Convergence");
        
        System.out.println("\n--- Current Modules in [src/StringPrograms] ---");
        System.out.println("1. StringLogic     - Two-pointer Palindrome Check");
        System.out.println("2. ReverseString   - Manual Character-based Reversal");
        System.out.println("3. CharFrequency   - ASCII Array Frequency Mapping");
        System.out.println("4. AnagramCheck     - Sorting & Comparison Logic");       
        System.out.println("5. LongestSubstring - Sliding Window Pattern");           
        System.out.println("6. StringCompress   - StringBuilder Optimization");
        

        System.out.println("\n--- Current Modules in [src/MatrixPrograms] ---");
        System.out.println("1. MatrixTranspose      - Row-Column Flips");
        System.out.println("2. MatrixAddition       - Element-wise Grid Summation");
        System.out.println("3. MatrixSearch         - Target Localization");
        System.out.println("4. MatrixMultiplication - Boss Level Triple-Loop Logic");
        System.out.println("5. MatrixDiagonalSum    - Single-loop Diagonal Accumulation");
        System.out.println("6. RowColumnSum         - Horizontal/Vertical Totals");
        System.out.println("7. IdentityMatrix       - Conditional Diagonal Generation (1s & 0s)");
        System.out.println("8. ScalarMultiplication - Constant-based Element Scaling");
        System.out.println("9. UpperTriangle        - Filters elements above diagonal");
        System.out.println("10. LowerTriangle       - Elements below main diagonal");

        System.out.println("\n--- NEW: Modules in [src/SortingPrograms] ---");
        System.out.println("1. BubbleSort           - Adjacent Swap Optimization (O(n^2))");
        System.out.println("2. SelectionSort        - Minimum Element Selection (O(n^2))");
        System.out.println("3. InsertionSort        - Shift-and-Insert Logic");


        System.out.println("\n--- NEW: Modules in [src/SearchingPrograms] ---");
        System.out.println("1. LinearSearch - Sequential Comparison (O(n))");
        System.out.println("2. BinarySearch - Divide & Conquer Optimization (O(log n))");

        System.out.println("\n--- NEW: Modules in [src/RecursionPrograms] ---");
        System.out.println("1. FactorialRecursion - Base Case & Stack Logic");
        System.out.println("2. FibonacciRecursion - Multiple Recursive Calls");
        System.out.println("3. StringReverseRecursion - Substring Slicing Logic");
        System.out.println("4. ArraySumRecursion  - sum of an array by traversing it with a recursive index pointer ($O(n)$ complexity). ");


        System.out.println("\n--- NEW: Modules in [src/NumberPrograms] ---");
        System.out.println("1. ArmstrongCheck - Mathematical Power-Sum Logic");
        System.out.println("2. PrimeCheck - Optimized O(sqrt(n)) primality test");
        
 
        System.out.println("\n[Next Step]: Commencing - Advanced String Manipulation.");
        System.out.println("==========================================");
    }
}
// End of Dashboard
