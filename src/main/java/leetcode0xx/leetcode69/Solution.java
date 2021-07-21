package leetcode0xx.leetcode69;

public class Solution {
    public int mySqrt(int x) {
        long start = 0;
        long end = x;
        long findNumber = 0;
        if (x == 1) return 1;
        while (start <= end) {
            findNumber = (start + end) / 2;
            if (findNumber * findNumber == x) {
                return (int) findNumber;
            } else {
                if (findNumber * findNumber < x) {
                    start = findNumber + 1;
                } else {
                    end = findNumber - 1;
                }
            }
        }
        return (findNumber * findNumber > x) ? (int) findNumber - 1 : (int) findNumber;
    }
}
