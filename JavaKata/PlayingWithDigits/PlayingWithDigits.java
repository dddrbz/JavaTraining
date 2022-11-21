package JavaKata.PlayingWithDigits;

public class PlayingWithDigits {
    public static long digPow(int n, int p) {
        long tenInPow = 1;
        long sum = 0;
        while (tenInPow * 10 < n) {
            tenInPow *= 10;
        }
        int number = n;
        while (number > 0) {
            sum += Math.pow(number / tenInPow, p);
            number -= number / tenInPow * tenInPow;
            tenInPow /= 10;
            ++p;
        }
        return (sum / n * n == sum) ? sum / n : -1;
    }

    public static void main(String[] args) {
        System.out.println(digPow(89, 1));
    }
}
