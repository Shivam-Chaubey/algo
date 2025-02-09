package recursion;

public class Fibonacci {

    public static void main(String[] args) {
        fibonacci(10);
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
}
