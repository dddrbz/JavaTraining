package JavaKata.YourOrderPlease;

public class YourOrderPlease {
    public static String order(String str) {
        if (str == null || str.length() == 0) return "";

        String[] words = str.split(" ");
        String result = new String();

        for (int k = 1; k < words.length + 1; ++k) {
            for (int i = 0; i < words.length; ++i) {
                if (Integer.valueOf(words[i]
                        .replaceAll("[a-zA-Z]", "")) == k) {
                    result += words[i];
                }
            }
            if (k != words.length) result += " ";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a"));
    }
}
