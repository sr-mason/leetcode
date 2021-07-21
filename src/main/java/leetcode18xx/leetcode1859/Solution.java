package leetcode18xx.leetcode1859;

public class Solution {
    public String sortSentence(String s) {
    String[] temp = s.split(" ");
    String[] result = new String[temp.length];
        for (int i = 0; i < temp.length; i++) {
            int count =  temp[i].charAt(temp[i].length() - 1) - 48 - 1;
            result[count] = temp[i].substring(0, temp[i].length() - 1);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            sb.append(result[i]);
            if (i < result.length - 1) {
                sb.append(" ");
            }
        }
    return sb.toString();
    }
}
