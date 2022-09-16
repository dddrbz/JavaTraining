package JavaKata.CountingDuplicates;

import java.util.HashMap;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        int res = 0;

        text = text.toLowerCase();
        char[] str = text.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char value : str) {
            if (map.containsKey(value)) {
                map.put(value, 1);
            } else {
                map.put(value, 0);
            }
        }
        return (int) map.values().stream().filter(x -> x == 1).count();
    }

    public static void main(String[] args) {
        System.out.println(duplicateCount("indivisibility"));
    }
}
