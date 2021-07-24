package leetcode4xx.leetcode415;

public class Solution {
    public String addStrings(String num1, String num2) {
        int index1 = num1.length() - 1;
        int index2 = num2.length() - 1;
        int position = 0;
        StringBuilder sb = new StringBuilder();
        while (index1 > -1 || index2 > -1 || position != 0) {
            int number1 = (index1 > -1) ? (int) num1.charAt(index1--) - 48 : 0;
            int number2 = (index2 > -1) ? (int) num2.charAt(index2--) - 48 : 0;
            int num = number1 + number2 + position;
            if (num > 9) {
                num -= 10;
                position = 1;
            } else {
                position = 0;
            }
            sb.append(num);

        }
        return sb.reverse().toString();
    }
}
