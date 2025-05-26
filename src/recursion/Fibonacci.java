package recursion;

public class Fibonacci {

    public static void main(String[] args) {
        fibonacci(10);
        System.out.println(fib(10));
    }

    public static void fibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Sequence: " + a + ", " + b);
        for(int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
    }

    public static int fib(int n) {
        if (n <= 1) {
            return n; // Base case: fib(0) = 0, fib(1) = 1
        }
        return fib(n - 1) + fib(n - 2);
    }
}
