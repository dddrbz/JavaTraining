package JavaKata.SimplePigLatin;

public class SimplePigLatin {
    public static String pigIt(String str) {
        String[] strAr = str.split(" ");
        str = "";
        for (int i = 0; i < strAr.length; ++i) {
            String word = strAr[i].intern();
            if (!word.matches("[^a-zA-Z]")) {
                str += word.substring(1) + word.substring(0, 1);
                str += (i == strAr.length - 1) ? "ay" : "ay ";
            } else {
                str += word;
            }
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(pigIt("Hello j world !"));
    }
}
