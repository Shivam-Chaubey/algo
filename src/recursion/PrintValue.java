package recursion;

public class PrintValue {
    public static void main(String[] args) {
        printGfg(10);
    }

    static int val = 1;
    private static void printGfg(int N) {
        // code here
        if(val>N)
            return;
        System.out.print("GFG ");
        val++;
        printGfg(N);
    }
}
