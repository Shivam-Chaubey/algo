package sorting;

import common.CommonUtility;

public class QuickSort extends CommonUtility{

    public static void main(String[] args) {
        int[] arr = generateRandomArray(10);
        printArray(arr);
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }

    private static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int partitionIndex = determinePartitionIndex(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    private static int determinePartitionIndex(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i < j){
            while(arr[i] <= pivot && i < high){
                i++;
            }
            while(arr[j] > pivot && j > low){
                j--;
            }
            if(i < j){
                swap(arr, i, j);
            }
        }
        swap(arr, low, j);
        return j;
    }

}
