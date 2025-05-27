package hashing;

import common.CommonUtility;

public class HashingDemo extends CommonUtility {
    public static void main(String[] args) {
        int minVal = 3, maxVal = 13;
        int[] arr = generateRandomArrayWithinRange(10, minVal, maxVal);
        printArray(arr);
        int[] hashArray = preSorting(arr, maxVal);
        printArray(hashArray);
        int fetchVal = 10;
        System.out.println(hashArray[fetchVal]);
        String lowerCaseString = generateRandomLowerCaseString(10);
        System.out.println(lowerCaseString);
        int[] charHashArray = preSortingCharacter(lowerCaseString.toCharArray(), 26);
        int fetchChar = 'b';
        System.out.println(charHashArray[fetchChar-97]);
    }

    public static int[] preSorting(int[] arr, int maxVal) {
        int[] hashArray = new int[maxVal + 1];
        for (int i : arr) {
            hashArray[i]+=1;
        }
        return hashArray;
    }

    public static int[] preSortingCharacter(char[] arr, int maxVal){
        int[] hashArray = new int[maxVal];
        for (int i : arr) {
            hashArray[i-97]+=1;
        }
        return hashArray;
    }
}
