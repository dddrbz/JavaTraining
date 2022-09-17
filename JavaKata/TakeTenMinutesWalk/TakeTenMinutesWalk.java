package JavaKata.TakeTenMinutesWalk;

import java.util.HashMap;

public class TakeTenMinutesWalk {
    public static boolean isValid(char[] walk) {
        boolean result = false;
        if (walk.length == 10) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (char value : walk) {
                map.put(value, map.containsKey(value) ? map.get(value) + 1 : 1);
            }
            result = (map.get('s') == map.get('n')
                    && map.get('e') == map.get('w')) ? true : false;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
    }
}
