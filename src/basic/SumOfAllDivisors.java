package basic;

import java.util.ArrayList;

public class SumOfAllDivisors {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(sumOfAllDivisors(n));
        System.out.println(sumOfAllDivisorsApproach2(n));
        System.out.println(sumOfAllDivisorsApproach3(n));
        System.out.println(sumOfAllDivisorsSieve(n));
        System.out.println(sumOfAllDivisorsOptimizedHarmonicLemma(n));
        System.out.println("*******");
        allDivisorsOptimizedSquareRoot(n);
        System.out.println(sumOfAllDivisorsHarmonicSquareRoot(n));
    }
    private static int sumOfAllDivisors(int n){
        // Write your code here.
        int sum = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<=i; j++){
                if(i%j == 0){
                    sum+=j;
                }
            }
        }
        return sum;
    }

    private static int sumOfAllDivisorsApproach2(int n){
        // Write your code here.
        int sum = 0;

        for (int i = 1; i <=n; i++) {
            sum = sum+(n/i)*i;
        }
        return sum;
    }

    public static int sumOfAllDivisorsApproach3(int n){
        int ans = 0;
        int i = 1;
        while (i <= n){
            int val = n / i;
            ans = ans + (i * val);
            i = i + 1;
        }
        return ans;
    }

    public static int sumOfAllDivisorsSieve(int n) {
        int[] sumDivisors = new int[n + 1];

        // Iterate through all numbers
        for (int i = 1; i <= n; i++) {
            // Add i to all its multiples
            for (int j = i; j <= n; j += i) {
                sumDivisors[j] += i;
            }
        }

        // Compute the sum of all divisor sums
        int totalSum = 0;
        for (int i = 1; i <= n; i++) {
            totalSum += sumDivisors[i];
        }

        return totalSum;
    }

    public static int sumOfAllDivisorsOptimizedHarmonicLemma(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += (n / i) * i;  // Directly add contributions
        }

        return sum;
    }

    private static void allDivisorsOptimizedSquareRoot(int n){
        ArrayList<Integer> divisors = new ArrayList<>();
        for(int i = 1; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                divisors.add(i);
            }
            if(i != n/i){
                divisors.add(n/i);
            }
        }
        System.out.println(divisors);
    }

    public static int sumOfAllDivisorsHarmonicSquareRoot(int n) {
        int sum = 0;

        for (int i = 1; i * i <= n; i++) {
            sum += i * (n / i);  // Contribution from 'i'
            if (i != n / i) {  // Avoid duplicate counting
                sum += (n / i) * i;
            }
        }

        return sum;
    }

}
