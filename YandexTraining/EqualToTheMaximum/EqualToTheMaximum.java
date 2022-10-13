package YandexTraining.EqualToTheMaximum;

import java.util.Scanner;

public class EqualToTheMaximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, max = -1, count = 0;
        while ((num = scanner.nextInt()) != 0) {
            if (num > max) {
                count = 1;
                max = num;
            } else if (num == max) {
                ++count;
            }
        }
        scanner.close();
        System.out.println(count);
    }
}
