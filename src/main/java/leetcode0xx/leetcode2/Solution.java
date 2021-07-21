package leetcode0xx.leetcode2;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode head = listNode;
        int pozition = 0;
        while (l1 != null || l2 != null) {
            int value1 = (l1 != null) ? l1.val : 0;
            int value2 = (l2 != null) ? l2.val : 0;
            int result = value1 + value2 + pozition;
            pozition = result / 10;

            listNode.next = new ListNode(result % 10);
            listNode = listNode.next;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (pozition > 0) {
            listNode.next = new ListNode(pozition);
        }
        return head.next;
    }
}
