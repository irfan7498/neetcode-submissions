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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int sz = 0 ;
        ListNode cur = head;
        while(cur != null){
            cur= cur.next;
            sz++;
        }
        
        cur = head;
        ListNode prev = null;
        int idx = sz - n ;// i starts from 0

        if (idx == 0){
            return head.next;
        } 
        int i = 0;

        while(i != idx){
            prev = cur;
            cur = cur.next;
            i++;
        }
        
        prev.next = cur.next;
        return head;
    }
}
