package leetcode0xx.leetcode7;

public class Solution {
    public int reverse(int x) {
        int length = lengthNum(x);
        long reverseNum = 0;
        int result = 0;
        for (int i = 0; i < length; i++) {
            reverseNum += (x % 10) * Math.pow(10, length - i - 1);
            x /= 10;
        }
        if (reverseNum >= Integer.MIN_VALUE
                && reverseNum <= Integer.MAX_VALUE) {
           result = (int) reverseNum;
        }
        return result;
    }

    int lengthNum(int num) {
        int lengthNum = 0;
        while (num != 0) {
            num /= 10;
            lengthNum++;
        }
        return lengthNum;
    }
    public int reverseSecondVersion(int x) {
        try {
            return (x / Math.abs(x)) * (Integer.parseInt(new StringBuilder((Integer.valueOf(Math.abs(x)).toString())).reverse().toString()));
        } catch (NumberFormatException | ArithmeticException e) {
            return 0;
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseSecondVersion(-1423));
    }
}
