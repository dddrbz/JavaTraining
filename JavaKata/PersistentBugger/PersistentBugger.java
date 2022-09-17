package JavaKata.PersistentBugger;

public class PersistentBugger {
    public static int persistence(long n) {
        char[] str = String.valueOf(n).toCharArray();
        int i = 0;
        for (; str.length > 1; ++i) {
            long mul = 1;
            for (char value : str) {
                mul *= value - '0';
            }
            str = String.valueOf(mul).toCharArray();
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(persistence(999));
    }
}
