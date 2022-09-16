package JavaKata.DuplicateEncoder;

import java.util.HashMap;

public class DuplicateEncoder {
    static String encode(String word){
        String result = "";
        char[] str = word.toLowerCase().toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char value : str) {
            map.put(value, map.containsKey(value) ? 1 : 0);
        }
        for (char value : str) {
            result += (map.get(value) == 1) ? ")" : "(";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(encode("recede"));
    }
}
