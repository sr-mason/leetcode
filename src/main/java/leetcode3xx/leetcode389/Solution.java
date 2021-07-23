package leetcode3xx.leetcode389;

import java.util.Arrays;

public class Solution {
    public char findTheDifference(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        char findChar = t1[t1.length - 1];
        for (int i = 0; i < s1.length; i++) {
            if (s1[i] != t1[i]) {
                findChar = t1[i];
                break;
            }
        }
        return findChar;
    }
}
