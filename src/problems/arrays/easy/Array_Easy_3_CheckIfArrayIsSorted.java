package problems.arrays.easy;

import common.CommonUtility;

public class Array_Easy_3_CheckIfArrayIsSorted extends CommonUtility{
    public static void main(String[] args) {
        int[] arr = generateRandomArray(10);
        printArray(arr);
        System.out.println("Array is sorted? : "+ checkIfArrayIsSorted(arr));
    }

    private static boolean checkIfArrayIsSorted(int[] arr){
        for(int i = 0; i< arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
