package leetcode2xx.leetcode283;

public class Solution {
    public void moveZeroes(int[] nums) {
        int start = 0;
        int i = 0;
        while (start < nums.length) {
            if (i < nums.length && nums[i] != 0) {
                nums[start++] = nums[i];
            }
            if (i >= nums.length) {
                nums[start++] = 0;
            }
            i++;
        }
    }


    public void moveZeroesVersion2(int[] nums) {
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[start++] = nums[i];
            }
        }
        for (int i = start; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}