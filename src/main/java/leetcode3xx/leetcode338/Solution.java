package leetcode3xx.leetcode338;

public class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = sum1inNumber(i);
        }
        return result;
    }

    static int sum1inNumber(int n) {
        int count = 0;
        while (n > 0) {
            if ( n % 2 == 1) {
                count++;
            }
            n /= 2;
        }
        return count;
    }
}
