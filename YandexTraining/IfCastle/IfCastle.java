package YandexTraining.IfCastle;

import java.util.Scanner;

public class IfCastle {
    private static int[] input() {
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; ++i) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;
    }

    private static void sortList(int[] array) {
        for (int i = 0; i < 2; ++i) {
            if (array[i] > array[i + 1]) {
                int buffer = array[i];
                array[i] =  array[i + 1];
                array[i+ 1] = buffer;
            }
        }
    }

    private static boolean checkStone(int[] array) {
        int a = (array[0] > array[1]) ? array[1] : array[0];
        int b = array[0] + array[1] - a;
        int d = (array[3] > array[4]) ? array[4] : array[3];
        int e = array[3] + array[4] - d;
        return (a <= d && b <= e);
    }

    public static void main(String[] args) {
        int[] array = input();
        sortList(array);
        System.out.println(checkStone(array));
    }
}
