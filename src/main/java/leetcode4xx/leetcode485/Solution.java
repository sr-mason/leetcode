package leetcode4xx.leetcode485;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxLength = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            if (count > maxLength) {
                maxLength = count;
            }
        }
        return maxLength;
    }
}