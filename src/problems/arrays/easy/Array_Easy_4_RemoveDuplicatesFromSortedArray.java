package problems.arrays.easy;

import java.util.HashSet;

import common.CommonUtility;

public class Array_Easy_4_RemoveDuplicatesFromSortedArray extends CommonUtility {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 1, 2, 4, 5, 5, 6, 7, 7, 7, 7, 9, 9, 11, 12, 12, 13, 13, 14, 15, 16};
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
                firstPointer++;
                arr[firstPointer] = arr[secondPointer];
            }
        }
        printArray(arr);
        return firstPointer+1;
    }

}
