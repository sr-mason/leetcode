package leetcode0xx.leetcode28;

public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        for (int i = 0; i < haystack.length() - needle.length()  + 1; i++) {
            if (needle.equals(haystack.substring(i, needle.length() + i))) {
                return i;
            }
        }
        return -1;
    }
}
