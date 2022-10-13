package YandexTraining.DotAndTriangle;

import java.util.Scanner;

import static java.lang.Math.*;

public class DotAndTriangle {
    private static boolean isDotInTriangle(int x, int y, double d) {
        return (x >= 0 && y >= 0 && y <= -x + d);
    }

    private static int whichPeakIsClosest(int x, int y, double d) {
        double a = sqrt(pow(x, 2) + pow(y, 2));
        double b = sqrt(pow(d - x, 2) + pow(y, 2));
        double c = sqrt(pow(x, 2) + pow(d - y, 2));

        if (a <= b && a <= c) {
            return 1;
        }
        if (b <= a && b <=c) {
            return (b == a) ? 1 : 2;
        }
        return 3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        System.out.println((isDotInTriangle(x, y, d) ?
                0 : whichPeakIsClosest(x, y, d)));
    }
}
