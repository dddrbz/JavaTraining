package LeetCodeTraining.ValidParentheses;

public class ValidParentheses {
    public static boolean isValid(String s) {
        int round = 0;
        int square = 0;
        int curly = 0;
        for (int i = 0; i < s.length(); ++i) {
            switch (s.charAt(i)) {
                case '(':
                    ++round;
                    break;
                case ')':
                    if (round != 0 && s.charAt(i - 1) != '[' && s.charAt(i - 1) != '{') {
                        --round;
                    } else {
                        return false;
                    }
                    break;
                case '[':
                    ++square;
                    break;
                case ']':
                    if (square != 0 && s.charAt(i - 1) != '(' && s.charAt(i - 1) != '{') {
                        --square;
                    } else {
                        return false;
                    }
                    break;
                case '{':
                    ++curly;
                    break;
                case '}':
                    if (curly != 0 && s.charAt(i - 1) != '[' && s.charAt(i - 1) != '(') {
                        --curly;
                    } else {
                        return false;
                    }
                    break;
            }
        }
        return ((round + square + curly) == 0);
    }
}
