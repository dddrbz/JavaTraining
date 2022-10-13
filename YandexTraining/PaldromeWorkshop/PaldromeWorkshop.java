package YandexTraining.PaldromeWorkshop;

import java.util.Scanner;

public class PaldromeWorkshop {
    private static char[] input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().toCharArray();
    }

    private static int countPaldrome(char[] str) {
        int count = 0, begin = 0, end = str.length - 1;
        while (begin < str.length / 2) {
            if (str[begin] != str[end]) ++count;
            ++begin;
            --end;
        }
        return count;
    }

    public static void main(String[] args) {
        char[] str = input();
        System.out.println(countPaldrome(str));
    }
}
