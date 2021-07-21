package leetcode0xx.leetcode26;

public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;
        int j = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]){
                nums[j++] = nums[i];
            }
        }
        if (nums[j] != nums[nums.length - 1]) {
            nums[j] = nums[nums.length - 1];
        }
        return ++j;
    }
}
