package JavaKata.GreedIsGood;

import java.util.HashMap;

public class GreedIsGood {
    public static int greedy(int[] dice){
        int score = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : dice) {
            if (!map.isEmpty() && map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
        for (int i = 1; !map.isEmpty(); ++i) {
            if (map.containsKey(i)) {
                if (map.get(i) >= 3) {
                    score += (i == 1) ? 1000 : i * 100;
                    map.put(i, map.get(i) - 3);
                }
                switch (i) {
                    case 1:
                        score += map.get(i) * 100;
                        break;
                    case 5:
                        score += map.get(i) * 50;
                }
                map.remove(i);
            }
        }
        return score;
    }

    public static void main(String[] argc) {
        System.out.println(greedy(new int[] { 1, 1, 1, 3, 1 }));
    }
}
