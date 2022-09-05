package VowelCount;

public class VowelCount {
    public static int getCount(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); ++i) {
            switch (str.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    ++count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(getCount("qwerty"));
    }
}
