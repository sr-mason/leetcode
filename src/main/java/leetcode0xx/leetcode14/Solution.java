package leetcode0xx.leetcode14;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        String maxPrefix = strs[0];
        String temp;
        for (int i = 1; i < strs.length; i++) {
            temp = strs[i];
            if (maxPrefix.length() < temp.length()) {
                temp = strs[i].substring(0, maxPrefix.length());
            } else {
                maxPrefix = maxPrefix.substring(0, strs[i].length());
            }
            maxPrefix = generalPrefix(maxPrefix, temp);
            if (maxPrefix.equals("")) {
                break;
            }
        }
        return maxPrefix;
    }

    String generalPrefix(String a, String b) {
        if (!a.equals(b)) {
            while (a.length() > 0) {
                a = a.substring(0 , a.length() - 1);
                b = b.substring(0, b.length() - 1);
                if (a.equals(b)) {
                    break;
                }
            }
        }
        return a;
    }
}
