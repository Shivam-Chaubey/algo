package basic;

import java.io.*;
import java.util.Random;


class EvenlyDivide {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        int N = random.nextInt(99999);
        System.out.println(N);
        System.out.println(evenlyDivides(N));
        System.out.println("~");
    }

    private static int evenlyDivides(int n) {
        // code here
        int num = n;
        int res = 0;
        while(num > 0){
            int digit = num % 10;
            if (digit != 0 && n % digit == 0){
                res++;
            }
            num = num / 10;
        }
        return res;
    }
}
