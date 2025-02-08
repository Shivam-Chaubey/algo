package sorting;

public class InsertionSort extends CommonUtility{
    public static void main(String[] args) {
        int [] arr = generateRandomArray(100);
        printArray(arr);
        printArray(insertionSort(arr));
        printArray(insertionSortGenerated(arr));
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
}
