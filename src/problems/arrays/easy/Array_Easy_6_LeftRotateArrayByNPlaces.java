package problems.arrays.easy;

import java.util.Arrays;

import common.CommonUtility;

public class Array_Easy_6_LeftRotateArrayByNPlaces extends CommonUtility{
    public static void main(String[] args) {
        int[] arr = generateRandomArray(5);
        printArray(arr);
        leftRotateByNPlacesBruteForce(arr, 106);
        printArray(arr);
    }

    private static int[] leftRotateByNPlacesBruteForce(int[] arr, int n){
        int arrayLength = arr.length, actualRotation = n % arrayLength;
        if(actualRotation == 0){
            return arr;
        }
        int[] tempArray = Arrays.copyOf(arr, actualRotation);
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

    
}
