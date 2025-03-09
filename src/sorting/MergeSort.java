package sorting;

import common.CommonUtility;

public class MergeSort extends CommonUtility {
    public static void main(String[] args) {
        int[] arr = generateRandomArray(10);
        printArray(arr);
        mergeSort(arr, 0, arr.length);
        printArray(arr);
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if(end - start < 2){
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(arr, start, mid); // left partition
        mergeSort(arr, mid, end); // right partition
        merge(arr, start, mid, end);
    }
    private static void merge(int[] arr, int start, int mid, int end) {
        if(arr[mid - 1] <= arr[mid]){
            // both arrays are already sorted - no need to merge them
            return;
        }
        int i = start, j = mid, tempIndex = 0;
        int[] tempArr = new int[end - start];
        while(i < mid && j < end){
            tempArr[tempIndex++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }
        System.arraycopy(arr, i, arr, start + tempIndex, mid - i);
        System.arraycopy(tempArr, 0, arr, start, tempIndex);
    }
}
