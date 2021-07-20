package leetcode345;

public class Solution {
    public String reverseVowels(String s) {
        int start = 0;
        int end = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);
        while (start < end) {
            if (isVowel(s.charAt(start))) {
                char temp = s.charAt(start);
               while (start < end) {
                   if (isVowel(s.charAt(end))) {

                       char temp2 = s.charAt(end);
                       sb.deleteCharAt(start);
                       sb.insert(start, temp2);

                       sb.deleteCharAt(end);
                       sb.insert(end, temp);
                       end--;
                       break;
                   }
                   end--;
                }
            }
            start++;
        }
        return sb.toString();
    }

    static boolean isVowel(char b) {
        char[] a = {'a','A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'};
        for (int i = 0; i < a.length; i++) {
            if (b == a[i]) {
                return true;
            }
        }
        return false;
    }
}
