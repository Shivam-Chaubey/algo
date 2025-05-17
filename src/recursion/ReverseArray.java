package recursion;

import java.util.ArrayList;

import common.CommonUtility;

public class ReverseArray extends CommonUtility{
    public static void main(String[] args) {
        int[] arr = generateRandomArray(10);
        printArray(arr);
        int[] reverseArray = reverseArray(arr);
        printArray(reverseArray);
        int[] reverseArrayInPlace = reverseArrayInPlace(arr);
        printArray(reverseArrayInPlace);
    }

    private static int[] reverseArray(int[] arr) {
        if (arr == null || arr.length == 0 || arr.length == 1) {
            return arr;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = arr.length-1; i >= 0; i--){
            arrayList.add(arr[i]);
        }
        return arrayList.stream().mapToInt(i -> i).toArray();
    }

    private static int[] reverseArrayInPlace(int[] arr){
        if(arr == null || arr.length == 0 || arr.length == 1){
            return arr;
        }
        for(int i = 0; i < arr.length/2; i++){
            swap(arr, i, arr.length-1-i);
        }
        return arr;
    }
}
