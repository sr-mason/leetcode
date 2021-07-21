package leetcode1816;

public class Solution {
    public String truncateSentence(String s, int k) {
        int count = 0;
        int i = 0;
        for (; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
            if (count == k) {
                break;
            }
        }
        return s.substring(i + 1);
    }
}
