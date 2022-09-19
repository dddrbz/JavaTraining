package JavaKata.TribonacciSequence;

import java.util.Arrays;

public class TribonacciSequence {
    public static double[] tribonacci(double[] s, int n) {
         double[] result = new double[n];

         for (int i = 0; i < n; ++i) {
             if (i == 3) break;
             result[i] = s[i];
         }

         for (int i = 0; i < n - 3; ++i) {
             result[i + 3] = result[i] + result[i + 1] + result[i + 2];
         }

         return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(tribonacci(new double []{1,1,1},10)));
    }
}
