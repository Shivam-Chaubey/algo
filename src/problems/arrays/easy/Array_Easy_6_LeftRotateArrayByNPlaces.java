package problems.arrays.easy;

import java.util.Arrays;

import common.CommonUtility;

public class Array_Easy_6_LeftRotateArrayByNPlaces extends CommonUtility{
    public static void main(String[] args) {
        int[] arr = generateRandomArray(5);
        printArray(arr);
        leftRotateByNPlacesBruteForce(arr, 107);
        printArray(arr);
        rightRotateByNPlace(arr, 107);
    }

    private static int[] leftRotateByNPlacesBruteForce(int[] arr, int n){
        int arrayLength = arr.length, actualRotation = n % arrayLength;
        if(actualRotation == 0){
            return arr;
        }
        int[] tempArray = new int[actualRotation];
        for(int i = 0; i < actualRotation; i++){
            tempArray[i] = arr[i];
        }
        for(int i = actualRotation; i < arrayLength; i++){
            arr[i - actualRotation] = arr[i];
        }
        // int j = 0;
        for(int i = arrayLength - actualRotation; i < arrayLength; i++){
            arr[i] = tempArray[i-(arrayLength-actualRotation)];
            // j++;
        }
        return arr;
    }

    private static int[] rightRotateByNPlace(int[] arr, int proposedRotation){
        int n = arr.length, actualRotation = proposedRotation % n;
        if(actualRotation == 0){
            return arr;
        }
        int[] tempArr = new int[actualRotation];
        for(int i = n-1; i > actualRotation; i --){
            tempArr[i] = arr[i];
        }
        return arr;
    }

    
}
