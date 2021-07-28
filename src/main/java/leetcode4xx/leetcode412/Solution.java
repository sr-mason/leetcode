package leetcode4xx.leetcode412;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String temp = "" + i;
            list.add(temp);
            if (i % 5 == 0 && i % 3 == 0) {
                list.set(i - 1, "FizzBuzz");
            }
            if (i % 3 == 0 && i % 5 != 0) {
                list.set(i - 1, "Fizz");
            }
            if (i % 5 == 0 && i % 3 != 0) {
                list.set(i - 1, "Buzz");
            }
        }
        return list;
    }
}
