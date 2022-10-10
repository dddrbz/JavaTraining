package YandexTraining.TwoNumbers;

import java.util.Arrays;
import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        int[] array = new int[2];
        input(array);
        System.out.println(checkNumbers(String.valueOf(array[0]).toCharArray(),
                String.valueOf(array[1]).toCharArray()));

    }

    private static void input(int[] array) {
        Scanner scanner = new Scanner(System.in);
        array[0] = scanner.nextInt();
        array[1] = scanner.nextInt();
        scanner.close();
    }

    private static boolean checkNumbers(char[] value_1, char[] value_2) {
        if (value_1.length != value_2.length) return false;
        Arrays.sort(value_1);
        Arrays.sort(value_2);
        return (value_1.equals(value_2)) ? true : false;
    }
}
