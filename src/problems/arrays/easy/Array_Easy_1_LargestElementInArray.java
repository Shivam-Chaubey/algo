package problems.arrays.easy;

import common.CommonUtility;

public class Array_Easy_1_LargestElementInArray extends CommonUtility{
    public static void main(String[] args) {
        int[] arr = generateRandomArray(10);
        printArray(arr);
        // bruteforce - sorting and last element
        System.out.println("Largest: " + determineLargestBetter(arr));
    }
    private static int determineLargestBetter(int[] arr){
        int largestElement = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largestElement){
                largestElement = arr[i];
            }
        }
        return largestElement;
    }
}
