package JavaKata.TwoToOne;

import java.util.Arrays;

public class TwoToOne {
    public static String longest (String s1, String s2) {
        String resultStr = s1 + s2;
        char[] checkStr = resultStr.toCharArray();
        char value = 0;

        resultStr = "";
        Arrays.sort(checkStr);
        for (int i = 0; i < checkStr.length; ++i) {
            if (i == 0) {
                resultStr += checkStr[i];
            } else {
                if (value != checkStr[i]) resultStr += checkStr[i];
            }
            value = checkStr[i];
        }
        return resultStr;
    }

    public static void main(String[] args) {
        System.out.println(longest("aaaabbbbxxxx", "bbbbcccckkkk"));
    }
}
