package leetcode4xx.leetcode409;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int longestPalindrome(String s) {
        List<Character> list = new ArrayList<>();
        int countPair = 0;
        for (int i = 0; i < s.length(); i++) {
           list.add(s.charAt(i));
        }
        int length = list.size();
        while (list.size() > 0) {
            Character temp = list.get(0);
            list.remove(temp);
            if (list.remove(temp)) {
                countPair++;
            }
        }
        return (countPair * 2 < length) ? countPair * 2 + 1 : countPair * 2;
    }
}
