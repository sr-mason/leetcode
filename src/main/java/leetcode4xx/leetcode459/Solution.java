package leetcode4xx.leetcode459;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 1; i < s.length() / 2 + 1; i++) {
            if (s.length() % i == 0) {
                map.put(i, s.substring(0, i));
            }
        }
        StringBuilder temp = new StringBuilder();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            int count = s.length() / entry.getKey();
            while (count > 0) {
                temp.append(entry.getValue());
                count--;
            }
            if (s.equals(temp.toString())) {
                return true;
            }
            temp.delete(0, temp.length());
        }
    return false;
    }
}
