package basic;

import java.util.Random;

public class CountDigit {
    public static void main(String[] args) {
        Random random = new Random();
        int N = random.nextInt(99999);
        System.out.println(N);
        System.out.println(countDigitsBruteforce(N));
        System.out.println(countDigitsOptimal(N));
        System.out.println(countDigitsOptimal2(N));
    }

    private static int countDigitsBruteforce(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    private static int countDigitsOptimal(int n) {
        return (int) Math.log10(n) + 1;
    }

    private static int countDigitsOptimal2(int n) {
        return String.valueOf(n).length();
    }
}
