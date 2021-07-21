package leetcode0xx.leetcode21;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode();
        ListNode head = listNode;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                int value2 = l2.val;
                listNode.next = new ListNode(value2);
                listNode = listNode.next;
                l2 = l2.next;
            }
            if (l2 == null && l1 != null) {
                int value1 = l1.val;
                listNode.next = new ListNode(value1);
                listNode = listNode.next;
                l1 = l1.next;
            }
            if (l1 != null && l2 != null) {
                int value1 = l1.val;
                int value2 = l2.val;
                if (value1 < value2) {
                    listNode.next = new ListNode(value1);
                    listNode = listNode.next;
                    l1 = l1.next;
                }
                if (value1 == value2) {
                    listNode.next = new ListNode(value1);
                    listNode = listNode.next;
                    listNode.next = new ListNode(value2);
                    listNode = listNode.next;
                    l2 = l2.next;
                    l1 = l1.next;
                }
                if (value1 > value2) {
                    listNode.next = new ListNode(value2);
                    listNode = listNode.next;
                    l2 = l2.next;
                }
            }
        }
        return head.next;
    }
}