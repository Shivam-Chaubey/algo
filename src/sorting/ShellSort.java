package sorting;

public class ShellSort extends CommonUtility{
    public static void main(String[] args) {
        int[] arr = generateRandomArray(20);
        printArray(arr);
        printArray(shellSort(arr));
    }

    public static int[] shellSort(int[] arr) {
        for(int gap = arr.length/2; gap > 0; gap /= 2) {
            for(int i = gap; i < arr.length; i++) {
                int temp = arr[i];
                int j = i;
                while(j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = temp;
            }
        }
        return arr;
    }
}


//4, 3, 12, 67, 2, 21, 43, 1
