package basic;

import java.util.Random;

public class LcmGcd {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(99999);
        int b = random.nextInt(99999);
        System.out.println(a + " " + b + " " + gcdBruteForce(a, b));
        System.out.println(a + " " + b + " " + gcdBetterApproach(b, a));
        System.out.println(a + " " + b + " " + gcdIDE(a, b));
        System.out.println(a + " " + b + " " + gcdEuclideanAlgorithm(20, 15));
    }

    private static int gcdBruteForce(int a, int b){
        int gcd = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    private static int gcdBetterApproach(int a, int b){
        for (int i = Math.min(a,b); i > 0; i--){
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    private static int gcdEuclideanAlgorithm(int a, int b){
        if (b == 0) {
            return a;
        }
        return gcdEuclideanAlgorithm(b, a % b);
    }

    private static int gcdIDE(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}
