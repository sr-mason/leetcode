package leetcode0xx.leetcode53;

class Solution {
    public int maxSubArray(int[] nums) {
        var sum = nums[0];
        var max = nums[0];
        for(var i = 1; i < nums.length; i++){
            if(sum < 0){
                sum = nums[i];
            } else {
                sum += nums[i];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
