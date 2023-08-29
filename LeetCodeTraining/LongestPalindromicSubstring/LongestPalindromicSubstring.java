package LeetCodeTraining.LongestPalindromicSubstring;

import java.util.Arrays;

public class LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {
        char[] str = s.toCharArray();
        String palindrome = String.valueOf(s.charAt(0));

        for (int i = 0; i < str.length - 1; ++i) {
            if (str[i] == str[i + 1]) {
                String currentPalindrome = getPalindrome(str, i, i + 1);
                if (palindrome.length() < currentPalindrome.length()) {
                    palindrome = currentPalindrome;
                }
            }

            if (i != 0 && str[i - 1] == str[i + 1]) {
                String currentPalindrome = getPalindrome(str, i - 1, i + 1);
                if (palindrome.length() < currentPalindrome.length()) {
                    palindrome = currentPalindrome;
                }
            }
        }

        return palindrome;
    }

    private static String getPalindrome(char[] str, int i, int n) {
        while (n < str.length && i >= 0) {
            if (str[i] != str[n]) {
                break;
            }
            ++n;
            --i;
        }
        ++i;
        --n;

        return new String(Arrays.copyOfRange(str, i, n + 1));
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
}
