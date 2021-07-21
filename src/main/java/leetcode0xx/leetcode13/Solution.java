package leetcode0xx.leetcode13;

import java.util.ArrayList;

public class Solution {
    public int romanToInt(String s) {
        Integer[] array = buildArray(s).clone();
        int num = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (duplicate(array, i + 1, array[i])) {
                num += array[i];
            }  else {
                num -= array[i];
            }
        }
        num += array[array.length - 1];
        return num;
    }

    boolean duplicate(Integer[] ar, int start, Integer num) {
        for (int i = start; i < ar.length; i++) {
            if (ar[start] > num) {
                return false;
            }
        }
        return true;
    }

    Integer[] buildArray(String s) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'M') {
                list.add(1000);
            } else if (s.charAt(i) == 'D') {
                list.add(500);
            } else if (s.charAt(i) == 'C') {
                list.add(100);
            } else if (s.charAt(i) == 'L') {
                list.add(50);
            } else if (s.charAt(i) == 'X') {
                list.add(10);
            } else if (s.charAt(i) == 'V') {
                list.add(5);
            } else if (s.charAt(i) == 'I') {
                list.add(1);
            }
        }
        return list.toArray(Integer[]::new);
    }
}