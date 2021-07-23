package leetcode2xx.leetcode242;

import java.util.Arrays;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }
    char[] s1 = s.toCharArray();
    Arrays.sort(s1);
    char[] t2 = t.toCharArray();
    Arrays.sort(t2);
    return Arrays.equals(s1, t2);
    }
}
