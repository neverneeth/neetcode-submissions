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
        HashMap<Node, Node> map = new HashMap<>();
        Node curr = head;
        Node head1 = null;
        while(curr != null)
        {
            Node corr = new Node(curr.val);
            map.put(curr, corr);
            if(curr == head)
            {
                head1 = corr;
            }
            curr = curr.next;
        }
        curr = head;
        while(curr != null)
        {
            Node next = map.get(curr.next);
            Node random = map.get(curr.random);
            Node corr = map.get(curr);
            corr.next = next;
            corr.random = random;
            curr = curr.next;
        }
        return head1;
    }
}