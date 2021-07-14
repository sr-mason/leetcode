package leetcode66;

public class Solution {
    public int[] plusOne(int[] digits) {
        int[] temp = digits.clone();
        if (temp[temp.length -1] != 9) {
            temp[temp.length - 1] += 1;
            return temp;
        } else {
            for (int i = 0; i < temp.length; i++) {
                if (temp[temp.length - 1 - i] == 9) {
                    temp[temp.length - 1 - i] = 0;
                } else {
                    temp[temp.length - 1 - i] += 1;
                    break;
                }
            }
            if (temp[0] == 0) {
                int[] a = new int[temp.length + 1];
                a[0] = 1;
                System.arraycopy(temp, 0, a, 1, temp.length);
                return a;
            } else {
                return temp;
            }
        }
    }
}
