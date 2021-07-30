package leetcode1929;

public class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] array = new int[nums.length * 2];
        for (int i = 0; i < array.length; i++) {
            array[i] = nums[i];
            array[i + nums.length] = nums[i];
        }
        return array;
    }
}
