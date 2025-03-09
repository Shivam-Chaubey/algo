package basic;

import java.util.Random;

public class CheckPrime {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(99999);
        System.out.println(n);
        System.out.println(checkPrimeBruteForce(n));
        System.out.println(checkPrimeSquareRootOptimized(n));
    }

    private static boolean checkPrimeBruteForce(int n) {
        if (n == 1)
            return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkPrimeSquareRootOptimized(int n) {
        if (n <= 1) return false; // 0 and 1 are not prime
        if (n == 2) return true; // 2 is the only even prime number
        if (n % 2 == 0) return false; // Even numbers (except 2) are not prime

        for (int i = 3; i <= Math.sqrt(n); i += 2) { // Check only odd numbers up to sqrt(num)
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
