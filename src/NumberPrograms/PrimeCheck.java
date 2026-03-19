package NumberPrograms;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.out.println);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean isPrime = true;

        if (n <= 1) isPrime = false;
        else {
            // Optimization: Only check up to the square root of n
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println(n + (isPrime ? " is Prime" : " is NOT Prime"));
        sc.close();
    }
}
