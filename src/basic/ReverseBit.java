package basic;

import java.util.Random;

public class ReverseBit {
    public static void main(String[] args) {
        Random random = new Random();
        long n = random.nextLong(999999999);
        System.out.println(n + " " + reverseBits(n));
    }

    public static long reverseBits(long number) {
        // Write your code here.
        String binaryString = String.format("%32s", Long.toBinaryString(number)).replace(' ', '0');
        String reversedBinary = new StringBuilder(binaryString).reverse().toString();
        return Long.parseUnsignedLong(reversedBinary, 2);
    }
}
