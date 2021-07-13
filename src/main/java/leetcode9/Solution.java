package leetcode9;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        long temp = Long.parseLong(new StringBuilder(Integer.valueOf(x).toString()).reverse().toString());
        if (temp > Integer.MAX_VALUE) {
            return false;
        }
        return (int) temp == x;
    }
}
