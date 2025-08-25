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
    public ListNode removeNthFromEnd(ListNode head, int n)
     {
        if(head.next==null)
        {
            return null;
        }
        int s=0;
        ListNode c=head;
        while(c!=null)
        {
            c=c.next;
            s++;
        } 
        if(n==s)
        {
            return head.next;
        }
        int ind=s-n;
        int i=1;
        ListNode prev=head;
        while(i<ind)
        {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head;
    }
}