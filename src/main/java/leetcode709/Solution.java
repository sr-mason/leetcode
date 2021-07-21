package leetcode709;

public class Solution {
    public String toLowerCase(String s) {
        char[] temp = s.toCharArray();
        for (int i = 0; i < temp.length; i++) {
            if ((int)temp[i] > 64 && (int) temp[i] < 91) {
                int symbol = (int) temp[i] + 32;
                temp[i] = (char) symbol;
            }
        }
        StringBuilder sBuilder = new StringBuilder();
        for (int i = 0; i < temp.length; i++) {
            sBuilder.append(temp[i]);
        }
        return sBuilder.toString();
    }
}
