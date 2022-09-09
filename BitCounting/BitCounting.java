package BitCounting;

public class BitCounting {
    public static int countBits(int n){
        int result = 0;
        for (; n > 0; n >>= 1) {
            result += n & 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countBits(1234));
    }
}
