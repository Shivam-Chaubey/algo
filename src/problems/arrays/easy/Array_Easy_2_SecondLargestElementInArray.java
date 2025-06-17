package problems.arrays.easy;

import common.CommonUtility;

public class Array_Easy_2_SecondLargestElementInArray extends CommonUtility{
    public static void main(String[] args) {
        int[] arr = generateRandomArray(10);
        printArray(arr);
        //bruteforce - sorting and from last position keep comparing if element is != last element
        int secondLargestElement = determineSecondLargestBetter(arr);
        System.out.println("Second Largest Element in the array: " + secondLargestElement);
        System.out.println("Second Largest Element Array(Optimal): " + determineSecondLargestOptimal(arr));
    }

    private static int determineSecondLargestBetter(int[] arr){
        int largestElement = determineLargestBetter(arr);
        int secondLargestElement = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > secondLargestElement && arr[i] < largestElement){
                secondLargestElement = arr[i];
            }
        }
        return secondLargestElement;
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

    private static int determineSecondLargestOptimal(int[] arr){
        int secondLargest = -1, largest = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] < largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

}
