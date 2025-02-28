package basic;

import java.util.Random;

public class ReverseNumber {
    public static void main(String[] args) {
        Random random = new Random();
        long n = random.nextLong(999999999);
        int intN = random.nextInt(999999999);
        System.out.println(n + " : " + reverseNumber(n));
        System.out.println(intN + " : " + reverse(intN));
    }

    private static long reverseNumber(long n) {
        long rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        return rev;
    }

    private static int reverse(int x) {
        int sign = x < 0 ? -1 : 1, positiveNum = Math.abs(x), reverseNum = 0, digit;
        while(positiveNum != 0){
            digit = positiveNum % 10;
            if (reverseNum > (Integer.MAX_VALUE - digit) / 10) {
                return 0;
            }
            reverseNum = reverseNum * 10 + digit;
            positiveNum /= 10;
        }
        return reverseNum*sign;
    }
}


