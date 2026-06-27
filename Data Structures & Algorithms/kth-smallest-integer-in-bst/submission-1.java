/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void inorder(TreeNode root, List<Integer> master)
    {
        if(root == null)
        {
            return;
        }
        inorder(root.left, master);
        master.add(root.val);
        inorder(root.right, master);
    }

    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> inord = new ArrayList<Integer>();
        inorder(root, inord);
        return inord.get(k-1);
    }
}