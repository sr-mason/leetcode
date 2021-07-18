package leetcode136;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int singleNumber(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i : nums) {
            if (!list.contains(i)) {
                list.add(i);
            } else {
                list.remove((Integer) i);
            }
        }
        return list.get(0);
    }

    public int singleNumberV2(int[] nums) {
        int input = 0;
        for (int num : nums) {
            input ^= num;

        }
        return input;
    }
}
