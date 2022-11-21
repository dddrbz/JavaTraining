package LeetCodeTraining.UglyNumber;

public class UglyNumber {
    public static boolean isUgly(int n) {
        while (n > 5) {
            if (n == n / 2 * 2) {
                n /= 2;
            } else if (n == n / 3 * 3) {
                n /= 3;
            } else if (n == n / 5 * 5) {
                n /= 5;
            } else {
                break;
            }
        }
        return (n <= 5);
    }
}
