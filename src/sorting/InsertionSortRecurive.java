package sorting;

import common.CommonUtility;

public class InsertionSortRecurive extends CommonUtility{
    public static void main(String[] args) {
        int[] arr = generateRandomArray(10);
        printArray(arr);
        insertionSort(arr, 0, arr.length);
        printArray(arr);
    }
    private static void insertionSort(int[] arr, int i, int n){
        if(i==n)
            return;
        for(int j=i; j>0 && arr[j]<arr[j-1]; j--){
            swap(arr, j, j-1);
        }
        // int j = i;
        // while(j>0 && arr[j]<arr[j-1]){
        //     swap(arr, j, j-1);
        // }
        insertionSort(arr, i+1, n);
    }
}
