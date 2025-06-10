package sorting;

import common.CommonUtility;

public class SelectionSort extends CommonUtility {
    public static void main(String[] args) {
        int[] arr = generateRandomArray(10);
        printArray(arr);
        // int[] resultIDE = selectionSortIDE(arr);
        // int[] resultSelf = selectionSortSelf(arr);
        int[] sortedStriver = selectionSortStriver(arr);
        // printArray(resultIDE);
        // printArray(resultSelf);
        printArray(sortedStriver);
    }

    public static int[] selectionSortSelf(int[] arr) {
       int unsortedPartitionIndex = arr.length - 1;
       for(int i = 0; i <= unsortedPartitionIndex; i++){
           int swapIndex = i;
           for(int j = 0; j <= unsortedPartitionIndex; j++){
               if(i != j && arr[j] > arr[swapIndex]){
                   swapIndex = j;
               }
           }
           swap(arr,unsortedPartitionIndex, swapIndex);
           unsortedPartitionIndex --;
       }
        return arr;
    }


    public static int[] selectionSortIDE(int[] arr) {
        int unsortedPartitionIndex = arr.length - 1;
        for(int i = 0; i < unsortedPartitionIndex; i++) {
            int swapIndex = i;
            for(int j = i + 1; j <= unsortedPartitionIndex; j++) {
                if(arr[j] < arr[swapIndex]) {
                    swapIndex = j;
                }
            }
            swap(arr, i, swapIndex);  // Swap the largest found element to the correct position
            unsortedPartitionIndex--;  // Shrink the unsorted partition
        }
        return arr;
    }

    private static int[] selectionSortStriver(int[] unsortedArray){
        int n = unsortedArray.length;
        int mini_index;
        for(int i = 0; i < n - 1; i++){
            mini_index = i;
            for(int j = i+1 ; j < n; j++){
                if(unsortedArray[j] < unsortedArray[mini_index]){
                    mini_index = j;
                }
            }
            swap(unsortedArray, mini_index, i);
        }
        return unsortedArray;
    }
}



