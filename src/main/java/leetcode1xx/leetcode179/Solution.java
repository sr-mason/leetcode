package leetcode1xx.leetcode179;

public class Solution {
    public String largestNumber(int[] nums) {
        String[] array = convert(nums);
        sortArray(array);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[array.length - i - 1]);
        }
        return trimZero(sb);
    }

    static String trimZero(StringBuilder sb) {
        while (sb.charAt(0) == '0' && sb.length() > 1) {
            sb.delete(0, 1);
        }

        return sb.toString();
    }

    static void sortArray(String[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (findMax(a[j], a[j + 1]) > 0) {
                    String temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    static int findMax(String a, String b) {
        String num1 = a;
        String num2 = b;
        if (num1.length() != num2.length()) {
            num1 = a + b;
            num2 = b + a;
        }
        for (int i = 0; i < num1.length(); i++) {
            int numA = Integer.parseInt(String.valueOf(num1.charAt(i)));
            int numB = Integer.parseInt(String.valueOf(num2.charAt(i)));
            if (numA > numB) {
                return 1;
            }
            if (numA < numB) {
                return -1;
            }
        }
        return 0;
    }

    static String[] convert(int[] nums) {
        String[] array = new String[nums.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = "" + nums[i];
        }
        return array;
    }
}
