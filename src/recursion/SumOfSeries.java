package recursion;

public class SumOfSeries {
    public static void main(String[] args) {
        System.out.println(sumOfSeries(5));
    }
    static int sumOfSeries(int n) {
        if(n == 1){
            return 1;
        }
        return (int)Math.pow(n, 3)+sumOfSeries(n-1);
    }
}
