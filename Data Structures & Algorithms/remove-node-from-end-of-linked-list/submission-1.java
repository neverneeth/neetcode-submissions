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
        int count = 0;
        ListNode[] arr = new ListNode[30];
        ListNode curr = head;
        while(curr != null)
        {
            arr[count++] = curr;
            curr = curr.next;
        }
        int prev = count-n-1;
        int after = count-n+1;
        if(prev<0)
        {
            head = arr[after];
            return head;
        }
        if(after>=count)
        {
            arr[prev].next= null;
            return head;
        }
        arr[prev].next = arr[after];
        return head;
    }
}