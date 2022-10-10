package YandexTraining.MountainPool;

import java.util.ArrayList;
import java.util.Scanner;

public class MountainPool {
    public static void main(String[] args) {
        ArrayList<Integer> mountain = input();
        System.out.println(countPool(mountain));
    }

    private static ArrayList<Integer> input() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> mountain = new ArrayList<Integer>();
        while (scanner.hasNextInt()) {
            mountain.add(scanner.nextInt());
        }
        scanner.close();
        return mountain;
    }

    private static int countPool(ArrayList<Integer> mountain) {
        int maxIndex = 0;
        int mountainSize = mountain.size();
        for (int i = 0; i < mountainSize; ++i) {
            if (mountain.get(i) > mountain.get(maxIndex)) maxIndex = i;
        }
        int column = 0;
        int water = 0;
        for (int i = 0; i < maxIndex; ++i) {
            if (mountain.get(i) > mountain.get(column)) {
                column = i;
            } else {
                water += mountain.get(column) - mountain.get(i);
            }
        }
        column = mountainSize - 1;
        for (int i = mountainSize - 1; i > maxIndex; --i) {
            if (mountain.get(i) > mountain.get(column)) {
                column = i;
            } else {
                water += mountain.get(column) - mountain.get(i);
            }
        }
        return water;
    }
}
