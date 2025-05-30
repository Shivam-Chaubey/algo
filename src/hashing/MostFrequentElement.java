package hashing;

import java.util.HashMap;
import java.util.Map;

import common.CommonUtility;

public class MostFrequentElement extends CommonUtility{
    public static void main(String[] args) {
        int arr[] = generateRandomArray(10);
        printArray(arr);
        System.out.println(mostFrequentElement(arr));
    }

    public static int mostFrequentElement(int[] nums) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        // Count frequencies
        for (int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int maxFreqKey = Integer.MAX_VALUE;

        // Find element with max frequency, smallest if tie
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            int currKey = entry.getKey();
            int currFreq = entry.getValue();
            if (currFreq > maxFreq || (currFreq == maxFreq && currKey < maxFreqKey)) {
                maxFreq = currFreq;
                maxFreqKey = currKey;
            }
        }

        return maxFreqKey;
    }

}
