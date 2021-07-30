package leetcode884;

import java.util.*;

public class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] arrayS1 = s1.split(" ");
        String[] arrayS2 = s2.split(" ");

        List<String> listS1 = cleanArrayDuplicate(arrayS1);
        List<String> listS2 = cleanArrayDuplicate(arrayS2);

        List<String> result = new ArrayList<>();
        result.addAll(noContains(listS1, arrayS2));
        result.addAll(noContains(listS2, arrayS1));

        String[] array = new String[result.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = result.get(i);
        }
        return array;
    }
    static List<String> cleanArrayDuplicate(String[] a) {
        List<String> result = new ArrayList<>();
        int count = 0;
        for (String value : a) {
            for (String s : a) {
                if (value.equals(s)) {
                    count++;
                }
            }
            if (count == 1) {
                result.add(value);
            }
            count = 0;
        }
        return result;
    }
    static List<String> noContains(List<String> list, String[] a) {
        List<String> result = new ArrayList<>();
        for (String s : list) {
            boolean flag = true;
            for (String value : a) {
                if (s.equals(value)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result.add(s);
            }
        }
        return result;
    }
}
