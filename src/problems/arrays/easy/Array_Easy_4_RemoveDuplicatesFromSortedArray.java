package problems.arrays.easy;

import java.util.HashSet;

import common.CommonUtility;

public class Array_Easy_4_RemoveDuplicatesFromSortedArray extends CommonUtility {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 6, 4, 4, 1, 6, 7, 8, 11, 54, 6 };
        printArray(arr);
        removeDuplicatesFromSortedArrayBruteForce(arr);
        printArray(arr);
        int[] arr1 = { 1, 4, 6, 4, 4, 1, 6, 7, 8, 11, 54, 6 };
        printArray(arr1);
        int uniqueElements = removeDuplicatesTwoPointersOptimal(arr1);
        System.out.println(uniqueElements);
    }

    private static void removeDuplicatesFromSortedArrayBruteForce(int[] arr) {
        HashSet<Integer> uniqueElements = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            uniqueElements.add(arr[i]);
        }
        int i = 0;
        for (int item : uniqueElements) {
            arr[i] = item;
            i++;
        }
    }

    private static int removeDuplicatesTwoPointersOptimal(int[] arr){
        int firstPointer = 0;
        for(int secondPointer = 1; secondPointer < arr.length; secondPointer++){
            if(arr[secondPointer] != arr[firstPointer]){
                arr[firstPointer+1] = arr[secondPointer];
                firstPointer++;
            }
        }
        printArray(arr);
        return firstPointer+1;
    }

}
