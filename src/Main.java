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
        
        System.out.println("\n--- Current Modules in [src/StringPrograms] ---");
        System.out.println("1. StringLogic     - Two-pointer Palindrome Check");
        System.out.println("2. ReverseString   - Manual Character-based Reversal");
        System.out.println("3. CharFrequency   - ASCII Array Frequency Mapping");

        System.out.println("\n[Next Step]: Commencing Day 4 - Advanced String Manipulation.");
        System.out.println("==========================================");
    }
}
// End of Dashboard
