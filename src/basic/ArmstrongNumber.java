package basic;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        System.out.println(isArmstrong(num));
        System.out.println(isArmstrongOptimized(num));
    }

    private static boolean isArmstrong(int number) {
        int digits = 0;
        int temp = number;
        double res = 0;
        while (temp != 0) {
            temp = temp / 10;
            digits++;
        }
        temp = number;
        while (temp != 0) {
            res += Math.pow(temp % 10, digits);
            temp = temp / 10;
        }
        return res == number;
    }

    private static boolean isArmstrongOptimized(int number) {
        int digits = (int) Math.log10(number) + 1;
        int temp = number;
        int res = 0;
        while (number > 0){
            int lastDigit = number % 10;
            res += (int) Math.pow(lastDigit, digits);
            number /= 10;
        }
        System.out.println(res);
        System.out.println(temp);
        return res == temp;
    }
}
