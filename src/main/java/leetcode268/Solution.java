package leetcode268;

public class Solution {
    public int missingNumber(int[] nums) {
        int max = nums[0];
        int sumArray = 0;
        for (int num : nums) {
            sumArray += num;
            max = Math.max(max, num);
        }
        if (max != nums.length) return max + 1;
        int sum = max * (max + 1) / 2;
        return sum - sumArray;
    }
}
