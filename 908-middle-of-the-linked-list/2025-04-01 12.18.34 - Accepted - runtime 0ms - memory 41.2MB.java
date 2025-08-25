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
    public ListNode middleNode(ListNode head) {
        if(head==null || head.next == null) return head;
        ListNode s=head,fast=head;
        while(fast != null && fast.next != null){
            s= s.next;
            fast = fast.next.next;
        }
        return s;
    }
}