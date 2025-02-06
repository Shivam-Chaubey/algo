package sorting;

import java.util.Arrays;

public class SelectionSort extends CommonUtility{
    public static void main(String[] args) {
        int[] arr = generateRandomArray(10);
        int[] resultIDE = selectionSortIDE(arr);
        int[] resultSelf = selectionSortSelf(arr);
        System.out.println(Arrays.toString(resultIDE));
        System.out.println(Arrays.toString(resultSelf));
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

}



