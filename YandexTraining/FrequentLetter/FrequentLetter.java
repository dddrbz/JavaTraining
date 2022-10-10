package YandexTraining.FrequentLetter;

import java.util.HashMap;
import java.util.Scanner;

public class FrequentLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] array = scanner.nextLine().toCharArray();
        scanner.close();

        int max = 0;
        char letter = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : array) {
            map.computeIfPresent(x, (key, value) -> value + 1);
            map.putIfAbsent(x, 1);
            int buff = map.get(x);
            if (buff > max) {
                max = buff;
                letter = x;
            }
        }
        System.out.println(letter);
    }
}
