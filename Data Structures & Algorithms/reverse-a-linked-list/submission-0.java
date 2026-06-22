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
    public ListNode reverseList(ListNode head) {
        if(head==null)
        {
            return head;
        }        
        Stack<ListNode> stack = new Stack<>();
        ListNode curr = head;
        while(curr != null)
        {
            stack.push(curr);
            curr = curr.next;
        }
        head = stack.pop();
        curr = head;
        curr.next = null;
        while(!stack.empty())
        {
            curr.next = stack.pop();
            curr = curr.next;
            curr.next = null;
        }
        return head;
    }
}