package basic;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
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
        System.out.println(res);
        return res == number;
    }
}
