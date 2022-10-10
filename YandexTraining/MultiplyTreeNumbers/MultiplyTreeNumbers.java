package YandexTraining.MultiplyTreeNumbers;

import java.util.*;

public class MultiplyTreeNumbers {
    private static ArrayList<Integer> input() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());
        }
        scanner.close();
        return list;
    }

    private static int biggestMultiply(ArrayList<Integer> list) {
        Collections.sort(list);
        int minMul = list.get(0) * list.get(1);
        int maxMul = list.get(list.size() - 3) * list.get(list.size() - 2);
        return (minMul > maxMul) ? minMul * list.get(list.size() - 1) : maxMul * list.get(list.size() - 1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = input();
        System.out.println(biggestMultiply(list));
    }
}
