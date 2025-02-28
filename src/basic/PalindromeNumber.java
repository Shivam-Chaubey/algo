package basic;

import java.util.Random;

public class PalindromeNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int intN = random.nextInt(999999999);
        System.out.println(intN + " " + isPalindrome(intN));
    }
    public static boolean isPalindrome(int n) {
        int reverseNum = 0;
        int temp = n;
        while(n != 0){
            reverseNum = reverseNum * 10 + n % 10;
            n /= 10;
        }
        return temp == reverseNum;
    }
}
