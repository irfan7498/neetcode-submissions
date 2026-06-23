class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l1 = list1;
        ListNode l2 = list2;
        
        // Use 'curr' as the unmoving dummy anchor
        ListNode curr = new ListNode(-1);
        // Use 'tail' to move forward and build the list
        ListNode tail = curr;

        // FIX 1: Change || to && so we only compare when BOTH have data
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = l1;   // Link to the existing l1 node
                l1 = l1.next;     // Move l1 forward
            } else {
                tail.next = l2;   // Link to the existing l2 node
                l2 = l2.next;     // Move l2 forward
            }
            tail = tail.next;     // FIX 2: Advance the tail exactly ONCE per loop
        }

        // FIX 3: Clean up whichever list still has leftover elements
        if (l1 != null) {
            tail.next = l1;
        } else {
            tail.next = l2;
        }
        
        // Return the start of the merged list, skipping the dummy node
        return curr.next;
    }
}
