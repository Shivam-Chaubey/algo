package recursion;

public class PrintNumbers {
    public static void main(String[] args) {
        System.out.print("Ascending ");
        printNos(10);
        System.out.println();
        System.out.print("Descending ");
        printReverseNos(10);
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

    static int val2 = 1;
    private static void printReverseNos(int N) {
        // code here
        if(N < val2)
            return;
        System.out.print(N + " ");
        N--;
        printReverseNos(N);
    }
}
