package basic;

import java.util.Random;

public class ReverseNumber {
    public static void main(String[] args) {
        Random random = new Random();
        long n = random.nextLong(999999999);
        System.out.println(n + " : " + reverseNumber(n));
    }

    private static long reverseNumber(long n) {
        long rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        return rev;
    }
}


