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

    public List<Integer> findDisappearedNumbersVersion2(int[] nums) {
        sort(nums);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                list.add(i + 1);
            }
        }
        return list;
    }
    static void sort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int pos = nums[i] - 1;
            if (nums[i] != nums[pos]) {
                int temp = nums[i];
                nums[i] = nums[pos];
                nums[pos] = temp;
            } else {
                i++;
            }
        }
    }
}
