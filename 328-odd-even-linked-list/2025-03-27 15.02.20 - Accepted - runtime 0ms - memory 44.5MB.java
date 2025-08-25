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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode o = head, even = head.next, evenHead = even;
        while(even!=null && even.next != null){
            o.next = even.next;
            o = o.next;
            even.next = even.next.next;
            even = even.next;
        }
        o.next = evenHead;
        return head;
    }
}