package sorting;

import java.util.ArrayList;

import common.CommonUtility;

public class MergeSort extends CommonUtility {
    public static void main(String[] args) {
        int[] arr = generateRandomArray(10);
        printArray(arr);
        // mergeSort(arr, 0, arr.length);
        // printArray(arr);
        mergeSortStriver(arr, 0, arr.length-1);
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










    private static void mergeSortStriver(int[] arr, int low, int high){
        if(low >= high)
            return;
        int mid = (low + high)/2;
        mergeSortStriver(arr, low, mid); // left partition
        mergeSortStriver(arr, mid+1, high); //right partition
        mergeStriver(arr, low, mid, high);
    }

    private static void mergeStriver(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int leftPointer = low;
        int rightPointer = mid+1;
        while (leftPointer <= mid && rightPointer <= high) {
            if(arr[leftPointer] <= arr[rightPointer]){
                temp.add(arr[leftPointer]);
                leftPointer++;
            }else{
                temp.add(arr[rightPointer]);
                rightPointer++;
            }
        }
        while(leftPointer <= mid){
            temp.add(arr[leftPointer]);
            leftPointer++;
        }
        while(rightPointer <= high){
            temp.add(arr[rightPointer]);
            rightPointer++;
        } 
        for(int i=low; i <= high; i++){
            arr[i] = temp.get(i-low);
        }
    }
}
