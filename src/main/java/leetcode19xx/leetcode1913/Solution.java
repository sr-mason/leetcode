package leetcode19xx.leetcode1913;

import java.util.Arrays;

public class Solution {
    public int maxProductDifference(int[] nums) {
        int max1 = nums[0];
        int indexMax1 = 0;
        int max2 = nums[nums.length - 1];
        int min1 = nums[0];
        int indexMin1 = 0;
        int min2 = nums[nums.length - 1];
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > max1) {
                max2 = Math.max(max1, max2);
                indexMax1 = i;
                max1 = nums[i];
            }
            if (nums[i] > max2 && indexMax1 != i) {
                max2 = nums[i];
            }

            if (nums[i] < min1) {
                min2 = Math.min(min1, min2);
                min1 = nums[i];
                indexMin1 = i;
            }
            if (nums[i] < min2 && indexMin1 != i) {
                min2 = nums[i];
            }
        }
        return max1 * max2 - min1 * min2;
    }

    public int maxProductDifferenceVersion2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - 1] * nums[nums.length - 2] - nums[0] * nums[1];
    }
}
