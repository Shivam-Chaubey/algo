package recursion;

public class PrintNumbers {
    public static void main(String[] args) {
        printNos(10);
    }

    static int val = 1;
    private static void printNos(int n) {
        // Your code here
        if(val > n)
            return;
        System.out.print(val + " ");
        val++;
        printNos(n);
    }
}
