package leetcode88;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int indexLastNums1 = m - 1;
        int indexLastNums2 = n - 1;
        int indexResultNum1 = m + n - 1;
        while (indexLastNums1 >= 0 || indexLastNums2 >= 0) {
            if (indexLastNums2 < 0 || (indexLastNums1 >= 0 && nums1[indexLastNums1] > nums2[indexLastNums2])) {
                nums1[indexResultNum1--] = nums1[indexLastNums1--];
            } else {
                nums1[indexResultNum1--] = nums2[indexLastNums2--];
            }
        }
    }
}
