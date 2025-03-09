package basic;

public class CheckPrime {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(checkPrimeBruteForce(n));
    }

    private static boolean checkPrimeBruteForce(int n) {
        if (n == 1)
            return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
