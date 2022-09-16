package JavaKata.RecoverASecretString;

import java.util.HashSet;
import java.util.Iterator;

public class RecoverASecretString {
    public static String recoverSecret(char[][] triplets) {
        String result = new String("");

        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < triplets.length; ++i) {
            for (int j = 0; j < 3; ++j) {
                set.add(triplets[i][j]);
            }
        }
        while (result.length() < set.size()) {
            Iterator<Character> iterator = set.iterator();
            exists : while (iterator.hasNext()) {
                char symbol = iterator.next();
                if (result.indexOf(symbol) >= 0) continue exists;
                String preSymbols = new String("");
                for (int i = 0; i < triplets.length; ++i) {
                    for (int j = 0; j < 3; ++j) {
                        if (triplets[i][j] == symbol) {
                            if (j == 2) {
                                preSymbols += (char)triplets[i][0];
                                preSymbols += (char)triplets[i][1];
                            } else if (j == 1) {
                                preSymbols += (char)triplets[i][0];
                            }
                        }
                    }
                }
                if ((preSymbols.length() == 0) ||
                (result.length() != 0 && preSymbols.matches("[" + result + "]+"))) {
                    result += symbol;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(recoverSecret(new char[][] {{'t','u','p'},
                {'w','h','i'},
                {'t','s','u'},
                {'a','t','s'},
                {'h','a','p'},
                {'t','i','s'},
                {'w','h','s'}
    }));
    }
}
