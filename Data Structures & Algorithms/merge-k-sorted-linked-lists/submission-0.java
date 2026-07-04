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
    public ListNode mergeKLists(ListNode[] lists) {
        
        if(lists.length == 0) return null;
        if(lists.length == 1) return lists[0];

        ListNode i = lists[0];
        ListNode j = null;
        ListNode head = new ListNode(-1);
        ListNode curr = head; 
        int k = 1;

        while(k < lists.length){
            curr = head;
            j = lists[k];
        while(i != null && j != null){
            if(i.val < j.val){
                curr.next = i;
                i = i.next;
            }
            else{
                curr.next = j;
                j = j.next;
            }
            curr = curr.next;
        }
        if(i != null){
            curr.next = i;
        }else{
            curr.next = j;
        }
        i = head.next;
        k++;
        }
        return head.next;
    }
}
