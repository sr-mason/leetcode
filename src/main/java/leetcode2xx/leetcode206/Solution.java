package leetcode2xx.leetcode206;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
    public ListNode reverseList(ListNode head) {
       ListNode prev = null;
       ListNode current = head;
       while (current != null) {
           ListNode nxt = current.next;
           current.next = prev;
           prev = current;
           current = nxt;
       }
       return prev;
    }
}