package common;

import java.util.Arrays;
import java.util.Random;

public class CommonUtility {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final Random random = new Random();

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] generateRandomArray(int size){
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = (int)(Math.random()*100);
        }
        return arr;
    }

    public static int[] generateRandomArrayWithinRange(int size, int minVal, int maxVal){
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = (int) (Math.random() * (maxVal - minVal + 1)) + minVal;
        }
        return arr;
    }

    public static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

    public static String generateRandomString(int length){
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(index));
        }

        return sb.toString(); 
    }

    public static String generatePalindromeString(int length) {
        if (length <= 0) return "";

        char[] result = new char[length];
        int half = length / 2;

        for (int i = 0; i < half; i++) {
            char c = CHARACTERS.charAt(random.nextInt(CHARACTERS.length()));
            result[i] = c;
            result[length - 1 - i] = c; // Mirror it
        }

        // If length is odd, add a random middle character
        if (length % 2 == 1) {
            result[half] = CHARACTERS.charAt(random.nextInt(CHARACTERS.length()));
        }

        return new String(result);
    }
}
