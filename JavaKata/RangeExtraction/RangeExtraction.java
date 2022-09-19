package JavaKata.RangeExtraction;

public class RangeExtraction {
    public static String rangeExtraction(int[] arr) {
        boolean flag = false;
        String str = String.valueOf(arr[0]);

        for (int i = 1; i < arr.length - 1; ++i) {
            if (Math.abs(arr[i] - arr[i - 1]) == 1 && Math.abs(arr[i + 1] - arr[i]) == 1) {
                flag = true;
                continue;
            } else {
                str += (flag) ? "-" + arr[i] : "," + arr[i];
                flag = false;
            }
        }
        str += (Math.abs(arr[arr.length - 3] - arr[arr.length - 1]) == 2) ?
                "-" + arr[arr.length - 1] : "," + arr[arr.length - 1];
        return str;
    }

    public static void main(String[] args) {
        System.out.println(rangeExtraction(new int[] {-6,-3,-2,-1,0,1,3,4,5,7,8,9,10,11,14,15,17,18,19,20}));
    }
}
