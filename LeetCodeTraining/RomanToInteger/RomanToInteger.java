package LeetCodeTraining.RomanToInteger;

public class RomanToInteger {
    public static int romanToInt(String s) {
        int preNumber = 0;
        int result = 0;
        for (int i = s.length() - 1; i >= 0; --i) {
            int number = takeNumber(s.charAt(i));
            if (number < preNumber) {
                result -= number;
            } else {
                result += number;
            }
            preNumber = number;
        }
        return result;
    }

    public static int takeNumber(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

}
