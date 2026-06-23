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
    public int getHeight(TreeNode root)
    {
        if(root == null) return 0;
        int lh = getHeight(root.left);
        int rh = getHeight(root.right);
        if(lh == -1 || rh == -1)
        {
            return -1;
        }
        int balance = lh>rh ? lh - rh : rh - lh;
        if(balance > 1)
        {
            return -1;
        }
        return (1+ Math.max(lh, rh));
    }
    public boolean isBalanced(TreeNode root) { 
        return (getHeight(root)!= -1);
    }
}