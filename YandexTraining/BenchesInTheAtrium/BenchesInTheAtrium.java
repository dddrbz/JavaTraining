package YandexTraining.BenchesInTheAtrium;

import java.util.Scanner;

public class BenchesInTheAtrium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int numberOfLegs = scanner.nextInt();
        int halfLength = (length / 2) - ((length % 2 == 0) ? 1 : 0);
        int leg = -1, nextLeg = -1;
        for (int i = 0; i < numberOfLegs; ++i) {
            nextLeg = scanner.nextInt();
            if (nextLeg <= halfLength) {
                leg = nextLeg;
            } else {
                break;
            }
        }
        scanner.close();
        System.out.print(leg);
        if (length % 2 == 0 || leg != halfLength) System.out.print(" " + (nextLeg));
    }
}
