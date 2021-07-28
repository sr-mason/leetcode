package leetcode5xx.leetcode541;

public class Solution {
    public String reverseStr(String s, int k) {
        if (s.length() == 1) {
            return s;
        }
        if (k > s.length()) {
            k = s.length();
        }
        StringBuilder temp = new StringBuilder();
        StringBuilder result = new StringBuilder();
        int i = 0;
        int flag = 0;
        int step =  k;
        while (i < s.length()) {
            temp = (flag % 2 == 0) ? temp.append(s, i, step).reverse()
                    : temp.append(s, i, step);
            result.append(temp);
            temp.delete(0,temp.length());
            flag++;
            i += k;
            step += k;
            if (step > s.length()) {
                step = s.length();
            }
        }
        return result.toString();
    }
}
