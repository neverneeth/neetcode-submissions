/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode curr = head;
        ListNode after = head;
        while(after != null && after.next != null)
        {
            curr = curr.next;
            after = after.next.next;
            if(curr==after)
            {
                return true;
            }
        }
        return false;
    }
}