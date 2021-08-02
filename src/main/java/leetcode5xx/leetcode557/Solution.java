package leetcode5xx.leetcode557;

public class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(new StringBuilder(word).reverse());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
