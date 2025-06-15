package problems.arrays.easy;

import common.CommonUtility;

public class Array_Easy_2_SecondLargestElementInArray extends CommonUtility{
    public static void main(String[] args) {
        int[] arr = generateRandomArray(10);
        printArray(arr);
        int largestElement = determineLargest(arr);
        int secondLargestElement = determineSecondLargest(arr, largestElement);
        System.out.println("Second Largest Element in the array: " + secondLargestElement);
    }

    private static int determineSecondLargest(int[] arr, int largestElement){
        int secondLargestElement = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > secondLargestElement && arr[i] < largestElement){
                secondLargestElement = arr[i];
            }
        }
        return secondLargestElement;
    }

    private static int determineLargest(int[] arr){
        int largestElement = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largestElement){
                largestElement = arr[i];
            }
        }
        return largestElement;
    }
}
