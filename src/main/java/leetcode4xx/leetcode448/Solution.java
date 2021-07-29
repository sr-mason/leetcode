package leetcode4xx.leetcode448;

import java.util.*;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        if (set.size() == 1 && set.contains(1)) {
            List<Integer> list = new ArrayList<>();
            list.add(2);
            return list;
        }

        Set<Integer> reference = new HashSet<>();
        for (int i = 1; i <= nums.length; i++) {
            reference.add(i);
        }

        reference.removeAll(set);
        return new ArrayList<>(reference);
    }
}
