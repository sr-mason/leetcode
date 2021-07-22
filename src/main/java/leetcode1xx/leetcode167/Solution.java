package leetcode1xx.leetcode167;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            result[0] = i;
            int start = i + 1;
            int end = numbers.length - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (numbers[mid] + numbers[result[0]] == target) {
                    result[1] = mid;
                    break;
                }
                if (numbers[mid] + numbers[result[0]] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            if (numbers[result[0]++] + numbers[result[1]++] == target) {
                break;
            }
        }
        return result;
    }
}
