package leetcode2xx.leetcode290;

import java.util.*;

public class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] word = s.split(" ");
        if (pattern.length() > word.length || word.length % pattern.length() != 0) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        int countPattern = 0;
        for (String value : word) {
            if (pattern.length() > countPattern) {
                char temp = pattern.charAt(countPattern++);
                if (map.containsKey(temp)) {
                    if (!map.get(temp).equals(value)) {
                        return false;
                    } else {
                        continue;
                    }
                }
                if (map.containsValue(value)) {
                    return false;
                }
                map.put(temp, value);
            } else {
                countPattern = 0;
            }
        }
        return true;
    }
}
