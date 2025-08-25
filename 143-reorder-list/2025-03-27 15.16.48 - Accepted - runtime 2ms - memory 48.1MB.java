/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static ListNode findMid(ListNode head){
        ListNode s = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            s = s.next;
            fast = fast.next.next; 
        }
        return s;
    }

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode mid = findMid(head);
        ListNode prev = null;
        ListNode curr = mid;
        ListNode next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode left = head;
        ListNode right = prev;
        while (right != null && right.next != null) {
            ListNode temp1 = left.next;
            ListNode temp2 = right.next;

            left.next = right;
            right.next = temp1;

            left = temp1;
            right = temp2;
        }
    }
}