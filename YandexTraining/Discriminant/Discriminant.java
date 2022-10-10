package YandexTraining.Discriminant;

import java.util.Scanner;

public class Discriminant {
    private static int a;
    private static int b;
    private static int c;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        System.out.println(countDiscriminant());
    }

    private static String countDiscriminant() {
        int d = b * b - 4 * a * c;
        if (d < 0) return String.valueOf(Math.sqrt(d));
        if (a == 0) return (b != 0) ? String.valueOf(-c / b) : c + " = 0";
        if (d == 0) return String.valueOf(-b / (2 * a));
        double xFirst = (-b - Math.sqrt(d)) / (2 * a);
        double xSecond = (-b + Math.sqrt(d)) / (2 * a);
        return String.valueOf((xFirst < xSecond) ? xFirst : xSecond) + " " +
                        String.valueOf((xFirst < xSecond) ? xSecond : xFirst);
    }
}
