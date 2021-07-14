package leetcode67;

public class Solution {
    public String addBinary(String a, String b) {
        int rank = 0;
        int index = 0;
        StringBuilder s = new StringBuilder();
        while (index < a.length() || index < b.length() || rank != 0) {
            int numA = (index < a.length()) ? Character.getNumericValue(a.charAt(a.length() - index - 1)) : 0;
            int numB = (index < b.length()) ? Character.getNumericValue(b.charAt(b.length() - index - 1)) : 0;
            int num = (numA + numB + rank) % 2;
            rank = (numA + numB + rank) / 2;
            s.append(num);
            System.out.println(s);
            index++;
        }
        return s.reverse().toString();
    }
}