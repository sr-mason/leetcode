package leetcode27;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int count = nums.length;
        int endCount = 0;
        for (int i = 0; i < nums.length - endCount; i++) {
            if (nums[i] == val) {
                count--;
                if (nums[nums.length - endCount - 1] != val) {
                    nums[i] = nums[nums.length - endCount - 1];
                    nums[nums.length - endCount - 1] = val;
                    endCount++;
                } else {
                    endCount++;
                    i--;
                }
            }
        }
        return count;
    }
    public int removeElementSecondVersion(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
