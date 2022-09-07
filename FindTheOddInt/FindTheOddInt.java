package FindTheOddInt;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindTheOddInt {
    public static int findIt(int[] a) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int x : a) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
        Iterator<Map.Entry<Integer, Integer>> itr = map.entrySet().iterator();
        int odd = 0;
        int sizeOdd = 0;
        while (itr.hasNext()) {
            Map.Entry<Integer, Integer> entry = itr.next();
            if (entry.getValue() % 2 == 1 && entry.getValue() > sizeOdd) {
                sizeOdd = entry.getValue();
                odd = entry.getKey();
            }
        }
        return odd;
    }

    public static void main(String[] args) {
        System.out.println(findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
    }
}
