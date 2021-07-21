package leetcode0xx.leetcode58;

public class Solution {
    public int lengthOfLastWord(String s) {
        String word = s.trim();
        int i = 0;
        for (; i < word.length(); i++) {
            if ( word.charAt(word.length() - 1 - i) == ' ') {
                break;
            }
        }
        return i;
    }
}
