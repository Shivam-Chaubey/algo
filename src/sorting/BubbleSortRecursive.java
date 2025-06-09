package sorting;

import common.CommonUtility;

public class BubbleSortRecursive extends CommonUtility{
    public static void main(String[] args) {
        int[] arr = generateRandomArray(10);
        printArray(arr);
        bubbleSort(arr, arr.length);
        printArray(arr);
    }

    private static void bubbleSort(int[] arr, int n){
        if(n==1)
            return;// only one element in unosrted array, need not sort it
        boolean isSwapped = false;
        for(int i=0; i<=n-2; i++){
            if(arr[i]>arr[i+1]){
                swap(arr, i, i+1);
                isSwapped = true;
            }
        }
        if(!isSwapped)
            return;//optimization if the provided array is already sorted
        bubbleSort(arr, n-1);
    }
}
