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
//empty create set of ListNode 
        //while(head != null) or while(index != -1)
            //if head is in set then return true
            //else add the head to set 
            // head = head.next
        //return false
class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode curr = head;
        Set<ListNode> seen = new HashSet<>();

        while(curr != null){
            if(seen.contains(curr)){
                return true;
            }else{
                seen.add(curr);
            }   
            curr = curr.next;
        }
        return false;
    }
}
