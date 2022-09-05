package SquarEveryDigit;

public class SquareEveryDigit {
    public int squareDigits(int n) {
        String str = new String();
        str += n;
        String number = new String("");
        for (int i = 0; i < str.length(); ++i) {
            number += (str.charAt(i) - '0') * (str.charAt(i) - '0');
        }
        return Integer.valueOf(number);
    }
}
