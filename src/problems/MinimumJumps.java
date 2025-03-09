package problems;

import static common.CommonUtility.generateRandomArray;
import static common.CommonUtility.printArray;

public class MinimumJumps {
    public static void main(String[] args) {
        int length = 50;
        int[] arr = generateRandomArray(length);
        arr[0] = 0;
        printArray(arr);
        System.out.println(minJumps(arr));
    }

    private static int minJumps(int[] arr) {

        int n = arr.length;

        if (n <= 1) return 0; // Already at the end
        if (arr[0] == 0) return -1; // Can't move from the start

        int jumps = 1; // Minimum jumps needed
        int maxReach = arr[0]; // Max index we can reach
        int steps = arr[0]; // Steps we can take before needing another jump

        for (int i = 1; i < n; i++) {
            if (i == n - 1) return jumps; // Reached the last index

            maxReach = Math.max(maxReach, i + arr[i]); // Update maxReach

            steps--; // Use a step

            if (steps == 0) { // If no more steps left
                jumps++; // Take a new jump

                if (i >= maxReach) return -1; // If we can't move further, return -1

                steps = maxReach - i; // Recalculate steps
            }
        }
        return -1; // If we exit loop, we can't reach the end
    }
}
