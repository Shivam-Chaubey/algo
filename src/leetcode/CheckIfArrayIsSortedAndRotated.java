package leetcode;

import java.util.Arrays;

import common.CommonUtility;

public class CheckIfArrayIsSortedAndRotated extends CommonUtility {
    public static void main(String[] args) {
        int[] arr = generateRandomArray(10);
        printArray(arr);
        System.out.println(check(arr));
        Arrays.sort(arr);
        printArray(arr);
        System.out.println(check(arr));
    }

    private static boolean check(int[] arr) {
        int count = 0, n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[(i + 1) % n])
                count++;
            if (count > 1)
                return false;
        }

        return true;
    }
}
