package leetcode3xx.leetcode303;

public class NumArray {
    int[] array;

    public NumArray(int[] nums) {
        this.array = new int[nums.length];
        System.arraycopy(nums, 0, this.array, 0, nums.length);
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum+= this.array[i];
        }
        return sum;
    }
}
