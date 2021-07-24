package leetcode3xx.leetcode383;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] arrayNote = ransomNote.toCharArray();
        char[] arrayMagazine = magazine.toCharArray();
        List<Character> listNote = new ArrayList<>();
        for (Character c: arrayNote) {
            listNote.add(c);
        }
        List<Character> listMagazine = new ArrayList<>();
        for (Character c: arrayMagazine) {
            listMagazine.add(c);
        }
        while (listNote.size() > 0) {
            if (listMagazine.contains(listNote.get(0))) {
                listMagazine.remove(listNote.get(0));
                listNote.remove(0);
            } else {
                return false;
            }
        }
        return true;
    }
}
