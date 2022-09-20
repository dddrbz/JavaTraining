package JavaKata.NextBiggerNumberWithTheSameDigits;

public class NextBiggerNumberWithTheSameDigits {
    public static long nextBiggerNumber(long n) {
        char[] number = String.valueOf(n).toCharArray();
        for (int i = number.length - 2; i >= 0; --i) {
            int lessIndex = containsMoreLess(i, number);
            if (i >= 0 && i != lessIndex) {
                char buffer = number[i];
                number[i] = number[lessIndex];
                number[lessIndex] = buffer;
                boolean flag = false;
                for (int k = i + 1; k < number.length; ++k) {
                    if (k < number.length - 1 && number[k] > number[k + 1]) {
                        char mem = number[k + 1];
                        number[k + 1] = number[k];
                        number[k] = mem;
                        flag = true;
                    }
                    if (k == number.length - 1 && flag) {
                        k = i;
                        flag = false;
                    }
                }
                break;
            }
        }
        long result = Long.valueOf(new String(number));
        return (n == result) ? -1 : result;
    }

    private static int containsMoreLess(int i, char[] array) {
        int mem = i;
        for (int k = i; k < array.length; ++k) {
            if (array[i] < array[k] ||
                    (array[mem] < array[k] && array[i] > array[k])) {
                i = k;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(nextBiggerNumber(12));
    }
}
