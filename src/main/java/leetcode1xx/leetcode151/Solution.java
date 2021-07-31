package leetcode1xx.leetcode151;

public class Solution {
    public String reverseWords(String s) {
        String[] array = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (array[array.length - i - 1] != null
                    && array[array.length - i - 1].length() != 0) {
                sb.append(array[array.length - i - 1]).append(" ");
            }
         }
        sb.delete(sb.length() - 1, sb.length());
        return sb.toString();
    }
}
