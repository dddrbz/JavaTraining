package LeetCodeTraining.ArrayToFormatString;

import java.util.Arrays;

public class ArrayToFormatString {
    private static String toFormatString(int[] array) {
        if (array.length <= 2) return Arrays.toString(array);

        String result = String.valueOf(array[0]);
        for (int i = 1; i < array.length - 1; ++i) {
            if (array[i - 1] == array[i] - 1 && array[i] + 1 == array[i + 1]) continue;
            result += (i >= 2 && array[i] - 2 == array[i - 2]) ?
                    " - " + array[i] : ", " + array[i];
        }
        result += (array.length - 1 >= 2 && array[array.length - 1] - 2 == array[array.length - 3]) ?
                " - " + array[array.length - 1] : ", " + array[array.length - 1];
        return result;
    }

    public static void main(String[] args) {
        System.out.println(toFormatString(new int[] {1,2,4,5,6,8,7}));
    }
}
