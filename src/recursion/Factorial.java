package recursion;

public class Factorial {
    public static void main(String[] args) {
        int factorialIterative = factorialIterative(5);
        int factorial = factorial(5);
        if(factorial == 0 || factorialIterative == 0){
            System.out.println("Factorial for negative number is undefined");
        }else{
            System.out.println(factorial);
            System.out.println(factorialIterative);
        }
    }

    public static int factorial(int n) {
        if(n == 0) return 1;
        else if(n > 0) return n * factorial(n-1);
        else return 0;
    }

    public static int factorialIterative(int n) {
        if(n == 0) return 1;
        else if(n > 0) {
            int factorial = 1;
            for(int i = 1; i <= n; i++){
                factorial = factorial * i;
            }
            return factorial;
        }
        else return 0;
    }
}
