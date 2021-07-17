package leetcode20;

public class Solution {
    public boolean isValid(String s) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (s.length() > i) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                sb.append(s.charAt(i));
            } else {
                if (sb.length() == 0) {
                    return false;
                }
                if (!equals(sb.charAt(sb.length() - 1), s.charAt(i))) {
                    return false;
                } else {
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
            i++;
        }
    return sb.length() == 0;
    }

    boolean equals(char a, char b) {
        return  (a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']');
    }
}
