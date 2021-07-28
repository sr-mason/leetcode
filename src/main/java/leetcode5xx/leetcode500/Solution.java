package leetcode5xx.leetcode500;

import java.util.*;

public class Solution {
    public String[] findWords(String[] words) {
        char[] line1 = {'q', 'w' , 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
        Set<Character> setLine1 = new HashSet<>();
        for (Character t: line1) {
            setLine1.add(t);
        }
        char[] line2 = {'a', 's' , 'd', 'f', 'g', 'h', 'j', 'k', 'l'};
        Set<Character> setLine2 = new HashSet<>();
        for (Character t: line2) {
            setLine2.add(t);
        }

        char[] line3 = {'z', 'x' , 'c', 'v', 'b', 'n', 'm'};
        Set<Character> setLine3 = new HashSet<>();
        for (Character t: line3) {
            setLine3.add(t);
        }
        int count = 0;
        List<String> list = new ArrayList<>();
        for (String word : words) {
            char[] temp = word.toLowerCase().toCharArray();
            Set<Character> tempSet = new HashSet<>();
            for (Character t : temp) {
                tempSet.add(t);
            }
            if (setLine1.containsAll(tempSet)) {
                list.add(word);
                count++;
            }
            if (setLine2.containsAll(tempSet)) {
                list.add(word);
                count++;
            }
            if (setLine3.containsAll(tempSet)) {
                list.add(word);
                count++;
            }
        }
        String[] a = new String[count];
        for (int i = 0; i < a.length; i++) {
            a[i] = list.get(i);
        }
        return a;
    }
}
