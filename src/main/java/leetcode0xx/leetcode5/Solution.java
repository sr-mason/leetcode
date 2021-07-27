package leetcode0xx.leetcode5;

public class Solution {
    public String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        if (s.length() == 2) {
            if (s.charAt(0) != s.charAt(1)) {
                return s.substring(0, 1);
            }
        }
        int maxLength = 0;
        String result = "";
        String temp;
        for (int i = 0; i < s.length() - 1; i++) {
            temp = searchPalindromic(s, i, i + 1);
            if (temp.length() > maxLength) {
                maxLength = temp.length();
                result = temp;
            }
        }
        for (int i = 1; i < s.length() - 1; i++) {
            temp = searchPalindromic(s, i - 1, i + 1);
            if (temp.length() > maxLength) {
                maxLength = temp.length();
                result = temp;
            }
        }
        return result;
    }

    static String searchPalindromic(String s, int start, int end) {
        while (0 <= start || end < s.length()) {
            if (s.charAt(start) == s.charAt(end)) {
                if (start == 0 || end == s.length() - 1) {
                    break;
                }
                start--;
                end++;
            } else {
                return s.substring(++start, end);           }
        }
        return s.substring(start, end + 1);
    }
}
