package JavaKata.DecodeTheMorseCode;

import java.util.Arrays;

public class DecodeTheMorseCode {
    public static String decode(String morseCode) {
        String[] letters = morseCode.split(" ");
        String result = new String();
        boolean space = false;
        for (int i = 0; i < letters.length; ++i) {
            if (letters[i] == "") {
                space = true;
                continue;
            }
            if (space) {
                result += (result.length() > 0) ? " " : "";
                space = false;
            }
//            result += MorseCode.get(letters[i]);
        }
        return result;
    }
}
