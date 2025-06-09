package sorting;

import common.CommonUtility;

public class InsertionSort extends CommonUtility {
    public static void main(String[] args) {
        int [] arr = generateRandomArray(10);
        printArray(arr);
        // printArray(insertionSort(arr));
        // printArray(insertionSortGenerated(arr));
        // printArray(insertionSortStriver(arr));
        printArray(insertionSortStriver(arr));
        printArray(insertionSortStriverForLoop(arr));
    }

    public static int[] insertionSortGenerated(int [] arr) {
        for (int i = 1; i< arr.length; i++){
            int key = arr[i];
            int j = i-1;
            while(arr[j]>key){
                arr[j+1] = arr[j];
            }
            arr[j+1] = key;
        }
        return arr;
    }

    public static int[] insertionSort(int [] arr) {
        for(int i = 1; i < arr.length; i++){
            int element = arr[i];
            for (int j = i-1; j>=0 && arr[j]>element; j--){
                arr[j+1] = arr[j]; // shifting elements to the right
            }
        }
        return arr;
    }

    private static int[] insertionSortStriver(int[] unsortedArray){
        for(int i = 1; i <= unsortedArray.length -1 ; i++){
            int j = i;
            while(j > 0 && unsortedArray[j-1] > unsortedArray[j]){
                swap(unsortedArray, j, j-1);
                j--;
            }
        }
        return unsortedArray;
    }

    private static int[] insertionSortStriverForLoop(int [] unsortedArray){
        for(int i = 1; i <= unsortedArray.length -1; i++){
            for(int j = i; j > 0  && unsortedArray[j-1] > unsortedArray[j]; j--){
                swap(unsortedArray, j, j-1);
            }
        }
        return unsortedArray;
    }
}
