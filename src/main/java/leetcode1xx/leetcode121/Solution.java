package leetcode1xx.leetcode121;

public class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max;
        int profitMax = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            min = Math.min(min, prices[i]);
            max = prices[i + 1];
            if (max > min) {
                profitMax = Math.max(profitMax, max - min);
            }
        }
        return profitMax;
    }
}
