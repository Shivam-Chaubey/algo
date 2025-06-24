package problems.arrays.easy;

import common.CommonUtility;

public class Array_Easy_5_LeftRotateArrayByOnePlace extends CommonUtility{
    public static void main(String[] args) {
        int arr[] = generateRandomArray(10);
        printArray(arr);
        leftRotateByOnePlace(arr);
        printArray(arr);
        rightRotateByOnePlace(arr);
        printArray(arr);
    }

    private static int[] leftRotateByOnePlace(int[] arr){
        int temp = arr[0];
        for(int i = 1; i < arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1]=temp;
        return arr;
    }

    private static int[] rightRotateByOnePlace(int[] arr){
        int n = arr.length, temp = arr[n-1];
        for(int i = n-2; i >= 0; i--){
            arr[i+1] = arr[i];
        }
        arr[0]=temp;
        return arr;
    }
}
