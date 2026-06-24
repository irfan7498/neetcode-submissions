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
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        

        if ( slow == null || slow.next == null  ){
            return false;
        }
        ListNode fast = head.next.next;

        while(slow != fast){
            if(fast == null ){
                return false;
            }
            slow = slow.next;
            if(fast.next == null ){
                return false;
            }
            fast = fast.next.next;
        }
        return true;
    }
}
//empty create set of ListNode 
        //while(head != null) or while(index != -1)
            //if head is in set then return true
            //else add the head to set 
            // head = head.next
        //return false
