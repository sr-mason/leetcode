package leetcode1xx.leetcode141;

import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        List<ListNode> list = new ArrayList<>();
        while (head.next != null) {
            if (list.contains(head)) {
                return true;
            } else {
                list.add(head);
            }
            head = head.next;
        }
    return false;
    }

    public boolean hasCycleVersion2(ListNode head){
        if (head == null) return false;
        ListNode first = head;
        ListNode second = head;
        while (first.next != null && second.next != null && second.next.next != null) {
            first = first.next;
            second = second.next.next;
            if (first == second) return true;
        }
        return false;
    }
}
