package leetcode2xx.leetcode237;

 class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
      }

    class Solution {
        public void deleteNode(ListNode node) {
            while (node.next != null) {
                node.val = node.next.val;
                if (node.next.next == null) {
                    node.next = null;
                } else {
                    node = node.next;
                }
            }
        }
    }

