package leetcode9xx.leetcode989;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int position = 0;
        while (i < num.length || position != 0 || k > 0) {
            int numNumber = (i < num.length) ? num[num.length - 1 - i] : 0;
            int kNumber = k % 10;
            int temp = (numNumber + kNumber + position);
            if (temp > 9) {
                position = 1;
                temp -= 10;
            } else {
                position = 0;
            }
            list.add(temp);
            k = (k > 0) ? k / 10 : 0;
            i++;
        }
        Collections.reverse(list);
        return list;
    }
}
