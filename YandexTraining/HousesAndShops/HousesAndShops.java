package YandexTraining.HousesAndShops;

import java.util.ArrayList;
import java.util.Scanner;

public class HousesAndShops {
    private static void input(ArrayList<Integer> houses, ArrayList<Integer> shops) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; ++i) {
            int type = scanner.nextInt();
            switch (type) {
                case 1:
                    houses.add(i);
                    break;
                case 2:
                    shops.add(i);
                    break;
            }
        }
        scanner.close();
    }

    private static int countMaxLength(ArrayList<Integer> houses, ArrayList<Integer> shops) {
        int min = 10;
        int max = 1;
        for (int house : houses) {
            for (int shop : shops) {
                int length = Math.abs(shop - house);
                if (length < min) min = length;
            }
            if (min > max) max = min;
            min = 10;
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> houses = new ArrayList<>();
        ArrayList<Integer> shops = new ArrayList<>();
        input(houses, shops);
        System.out.println(countMaxLength(houses, shops));
    }
}
