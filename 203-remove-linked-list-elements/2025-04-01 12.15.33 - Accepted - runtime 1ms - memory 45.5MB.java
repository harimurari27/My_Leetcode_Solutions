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
    public ListNode removeElements(ListNode head, int val) {
        ListNode ans = new ListNode(0, head);
        ListNode d = ans;

        while (d != null) {
            while (d.next != null && d.next.val == val) {
                d.next = d.next.next;
            }
            d = d.next;
        }

        return ans.next;        
    }
}