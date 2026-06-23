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
    public int maxTillNow = 0;

    public int getDepth(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }
        int ldepth = this.getDepth(root.left);
        int rdepth = this.getDepth(root.right);
        this.maxTillNow = Math.max(this.maxTillNow, ldepth + rdepth);
        return Math.max(1+ldepth, 1+rdepth); 
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int depth = this.getDepth(root);
        return this.maxTillNow;
    }
}