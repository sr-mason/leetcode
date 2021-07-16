package leetcode35;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;
        int mid;
        int searchIndex = 0;
        if (nums[0] > target) {
            return  0;
        }
        if (nums[last] < target) {
            return last + 1;
        }
        while (first <=  last) {
            mid = first + last;
            if (target == nums[mid]) {
                return mid;
            } else {
                if (target < nums[mid]) {
                    last = mid - 1;
                } else {
                    first = mid + 1;
                }
            }
        }
        if (target > first) {
            searchIndex = first;
        }
        return searchIndex;
    }
}
