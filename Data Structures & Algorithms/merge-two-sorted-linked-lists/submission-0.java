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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l1 = list1;
        ListNode l2 = list2;
        if (list1 == null && list2 == null) {
            return null;
        }
        ArrayList<Integer> nums = new ArrayList<>(); 
       while(l1 != null ){
        nums.add(l1.val);
        l1 = l1.next;
       }
       while(l2 != null ){
        nums.add(l2.val);
        l2 = l2.next;
       }

       Collections.sort(nums);
       ListNode head = new ListNode(nums.get(0));
       ListNode curr = head;

       for (int i = 1 ; i < nums.size() ; i++){
        curr.next = new ListNode(nums.get(i));
        curr = curr.next;
       } 
       curr.next = null;
       return head;
    }
}