package JavaKata.Snail;

import java.util.Arrays;

public class Snail {
    public static int[] snail(int[][] array) {
        int n = array.length;
        int snLength = n * n;
        int start = 0;
        if (n != 0 && array[0].length != n) snLength = 0;
        int[] snailArray = new int[snLength];
        int k = 0, i, j;

        while (k < snLength) {
            i = j = start;
            while (j < n) {
                snailArray[k++] = array[i][j];
                ++j;
            }
            --j;
            ++i;
            while (i < n) {
                snailArray[k++] = array[i][j];
                ++i;
            }
            --i;
            --j;
            while (j >= start) {
                snailArray[k++] = array[i][j];
                --j;
            }
            ++j;
            --i;
            while (i >= start + 1) {
                snailArray[k++] = array[i][j];
                --i;
            }
            ++start;
            --n;
        }
        return snailArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(snail(new int[][] {{}})));
    }
}
