/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        Node curr = head;
        while(curr != null)
        {
            Node next = new Node(curr.val);
            next.next = curr.next;
            curr.next = next;
            curr = next.next;
        }
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next; 
        }
        curr = head;
        Node reshead = head.next;
        Node cloneCurr = reshead;
        while(curr != null)
        {
            curr.next = curr.next.next;
            if (cloneCurr.next != null) {
                cloneCurr.next = cloneCurr.next.next;
            }            
            curr = curr.next;
            cloneCurr = cloneCurr.next;
        }
        return reshead;
    }
}