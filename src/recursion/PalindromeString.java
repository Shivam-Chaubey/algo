package recursion;

import common.CommonUtility;

public class PalindromeString extends CommonUtility {
    public static void main(String[] args) {
        String inputString = generateRandomString(10);
        String palindromeString = generatePalindromeString(10);
        System.out.println(inputString);
        System.out.println(checkPalindromeString(inputString));
        System.out.println(palindromeString);
        System.out.println(checkPalindromeString(palindromeString));
    }

    private static boolean checkPalindromeString(String inputString) {
        char[] stringCharArray = inputString.toCharArray();
        for (int i = 0; i < stringCharArray.length / 2; i++) {
            if (stringCharArray[i] != stringCharArray[stringCharArray.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
