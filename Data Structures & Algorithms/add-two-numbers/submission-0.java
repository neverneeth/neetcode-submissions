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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        int count1 = 0;
        int count2 = 0;
        while(curr1 != null || curr2 != null)
        {
            if(curr1 != null)
            {
                count1++;
                curr1 = curr1.next;
            }
            if(curr2 != null)
            {
                count2++;
                curr2 = curr2.next;
            }
        }
        curr1 = count1>count2 ? l1 : l2;
        curr2 = count1>count2 ? l2 : l1;
        int check = count1>count2 ? 1 : 0;
        int carry = 0;
        ListNode prev = null;
        while(curr1 != null && curr2 != null)        
        {
            int val = (curr1.val + curr2.val + carry);
            carry = val/10;
            int digit = val%10;
            curr1.val = digit;
            prev = curr1;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        while(curr1 != null)
        {
            int val = (curr1.val + carry);
            carry = val/10;
            int digit = val%10;
            curr1.val = digit;
            prev = curr1;
            curr1 = curr1.next;
        }
        if(carry > 0)
        {
            ListNode last = new ListNode(carry);
            prev.next = last;
        }
        if(check==1)
        {
            return l1;
        }
        else
        {
            return l2;
        }
    }
}