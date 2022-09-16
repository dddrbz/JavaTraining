package JavaKata.IsNumberPrime;

import java.math.BigInteger;

public class IsNumberPrime {
    public static boolean isPrime(int num) {
        BigInteger integer = BigInteger.valueOf(num);
        return (num > 0) ? integer.isProbablePrime(num) : false;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(0));
    }
}
