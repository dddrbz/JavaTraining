package JavaKata.FindTheParityOutlier;

public class FindTheParityOutlier {
    static int find(int[] integers) {
        int div;
        if ((integers[0] & 1) + (integers[1] & 1) + (integers[2] & 1) >= 2) {
            div = 0;
        } else {
            div = 1;
        }
        int res = 0;
        for (int x : integers) {
            if ((x & 1) == div) {
                res = x;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(find(new int[] {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781}));
    }
}
