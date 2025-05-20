package recursion;

import common.CommonUtility;

public class PalindromeString extends CommonUtility {
    public static void main(String[] args) {
        String inputString = generateRandomString(10);
        String palindromeString = generatePalindromeString(10);
        System.out.println(inputString);
        System.out.println(checkPalindromeString(inputString));
        checkPalindromeStringRecursion(inputString.toCharArray(), 0, inputString.length()-1);
        System.out.println(palindromeString);
        System.out.println(checkPalindromeString(palindromeString));
        checkPalindromeStringRecursion(palindromeString.toCharArray(), 0, palindromeString.length()-1);
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

    private static void checkPalindromeStringRecursion(char[] inputStringCharArray, int start, int end){
        if(start >= end){
            System.out.println("True");
            return;
        }
        if(inputStringCharArray[start] != inputStringCharArray[end]){
            System.out.println("False");
            return;
        }
        checkPalindromeStringRecursion(inputStringCharArray, start+1, end-1);
    }
}
