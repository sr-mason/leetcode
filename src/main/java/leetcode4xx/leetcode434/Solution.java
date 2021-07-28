package leetcode4xx.leetcode434;

public class Solution {
    public int countSegments(String s) {
        if(s.length() == 0) return 0;
        s = s.trim();
        String[] temp = s.split(" ");
        int count = 0;
        for (String value : temp) {
            if (value.length() != 0) {
                count++;
            }
        }
        return count;
    }

    public int countSegmentsVersion2(String s) {
        int count = 0;
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) != ' ') {
                while (s.charAt(i) != ' ') {
                    i++;
                    if (i == s.length() - 1) break;
                }
                count++;
            }
            i++;
        }
        return count;
    }
}
