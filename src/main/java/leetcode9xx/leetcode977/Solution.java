package leetcode9xx.leetcode977;

public class Solution {
    public int[] sortedSquares(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int [] result = new int[nums.length];
        int count = result.length - 1;
        while (count >= 0) {
            if (Math.abs(nums[start]) > Math.abs(nums[end])) {
                result[count--] = (int) Math.pow(nums[start++], 2);
            } else {
                result[count--] = (int) Math.pow(nums[end--], 2);
            }
        }
        return result;
    }
}
