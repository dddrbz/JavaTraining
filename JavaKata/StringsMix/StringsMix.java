package JavaKata.StringsMix;

import java.util.*;

public class StringsMix {
    public static String mix(String s1, String s2) {
        s1 = s1.replaceAll("[^a-z]", "");
        s2 = s2.replaceAll("[^a-z]", "");
        HashMap<Character, String> mapS1 = initMap(s1);
        HashMap<Character, String> mapS2 = initMap(s2);

        Character chr1 = biggest(mapS1);
        Character chr2 = biggest(mapS2);
        int maxLen1 = mapS1.get(chr1).length();
        int maxLen2 = mapS2.get(chr2).length();

        String result = new String();
        String commonStr = new String();
        while (maxLen1 > 1 || maxLen2 > 1) {
            if (!mapS1.isEmpty() && !mapS2.isEmpty()) {
                if (maxLen1 >= maxLen2) {
                    if (mapS2.containsKey(chr1) && mapS2.get(chr1).length() == maxLen1) {
                        commonStr += (commonStr.length() > 0) ? "/" + "=:" + mapS1.get(chr1)
                                : "=:" + mapS1.get(chr1);
                    } else {
                        result += (result.length() > 0) ? "/" + "1:" + mapS1.get(chr1) : "1:" + mapS1.get(chr1);
                    }
                    mapS1.remove(chr1);
                    mapS2.remove(chr1);
                } else {
                    result += (result.length() > 0) ? "/" + "2:" + mapS2.get(chr2) : "2:" + mapS2.get(chr2);
                    mapS1.remove(chr2);
                    mapS2.remove(chr2);
                }
                chr1 = (mapS1.isEmpty()) ? 0 : biggest(mapS1);
                chr2 = (mapS2.isEmpty()) ? 0 : biggest(mapS2);
                if ((maxLen1 > mapS1.get(chr1).length() && maxLen1 > mapS2.get(chr2).length()) ||
                        (maxLen2 > mapS1.get(chr1).length() && maxLen2 > mapS2.get(chr2).length())) {
                    if (commonStr.length() > 0) {
                        result += (result.length() > 0) ? "/" + commonStr : commonStr;
                        commonStr = "";
                    }
                }
                maxLen1 = (mapS1.isEmpty()) ? 0 : mapS1.get(chr1).length();
                maxLen2 = (mapS2.isEmpty()) ? 0 : mapS2.get(chr2).length();
            } else if (!mapS1.isEmpty() && mapS2.isEmpty()) {
                result += (result.length() > 0) ? "/" + "1:" + mapS1.get(chr1) : "1:" + mapS1.get(chr1);
                mapS1.remove(chr1);
                chr1 = (mapS1.isEmpty()) ? 0 : biggest(mapS1);
                maxLen1 = (mapS1.isEmpty()) ? 0 : mapS1.get(chr1).length();
            } else if (mapS1.isEmpty() && !mapS2.isEmpty()) {
                result += (result.length() > 0) ? "/" + "2:" + mapS2.get(chr2) : "2:" + mapS2.get(chr2);
                mapS2.remove(chr2);
                chr2 = (mapS2.isEmpty()) ? 0 : biggest(mapS2);
                maxLen2 = (mapS2.isEmpty()) ? 0 : mapS2.get(chr2).length();
            }
        }
        return result;
    }

    public static HashMap<Character, String> initMap(String str) {
        char[] array = str.toCharArray();
        HashMap<Character, String> map = new HashMap<Character, String>();
        for (char value : array) {
            map.put(value, map.containsKey(value) ?
                    map.get(value) + String.valueOf(value) : String.valueOf(value));
        }
        return map;
    }

    public static Character biggest(HashMap<Character, String> map) {
        Character max = 0;
        int maxLen = 0;
        for (Character value : map.keySet()) {
            int length = map.get(value).length();
            if (length > maxLen ||
                    (length == maxLen && value < max)) {
                max = value;
                maxLen = length;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(mix("A generation must confront the looming ", "codewarrs"));
//        mix("Are they here", "yes, they are here");
    }

}
