package JavaKata.ArrayDiff;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDiff {
    public static int[] arrayDiff(int[] a, int[] b) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int x : a) {
            list.add(x);
        }
        for (int x : b) {
            while (list.indexOf(x) >= 0) list.remove(list.indexOf(x));
        }
        a = Arrays.stream(list.toArray()).mapToInt(i -> (int)i).toArray();
        return a;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDiff(new int [] {1,2}, new int[] {1})));
    }
}
