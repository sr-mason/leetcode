package leetcode0xx.leetcode3;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        if (s.length() == 1) return 1;
        Set<Character> set = new HashSet<>();
        int count = 1;
        int maxCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (set.add(s.charAt(i))) {
                for (int j = i + 1; j < s.length(); j++) {
                    if (set.add(s.charAt(j))) {
                        count++;
                    } else {
                        set.clear();
                        count = 1;
                        maxCount = Math.max(count, maxCount);
                        break;
                    }
                    maxCount = Math.max(count, maxCount);
                }
            }
        }
        return maxCount;
    }
}