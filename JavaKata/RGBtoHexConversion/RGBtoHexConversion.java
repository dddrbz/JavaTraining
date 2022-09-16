package JavaKata.RGBtoHexConversion;

public class RGBtoHexConversion {
    public static String rgb(int r, int g, int b) {
        String hexResult = new String("");

        if (r < 17) hexResult += 0;
        hexResult += Integer.toHexString(r).toUpperCase();
        if (g < 17) hexResult += 0;
        hexResult += Integer.toHexString(g).toUpperCase();
        if (b < 17) hexResult += 0;
        if (b < 0) b = 0;
        hexResult += Integer.toHexString(b).toUpperCase();
        return hexResult;
    }

    public static void main(String[] args) {
        System.out.println(rgb(0, 0, -20));
    }
}
