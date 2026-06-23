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
        if(root==null) return 0;
        return (1 + Math.max(getHeight(root.left), getHeight(root.right)));
    }
    public boolean isBalanced(TreeNode root) { 
        if(root == null) return true;
        int lheight =  getHeight(root.left);
        int rheight = getHeight(root.right);
        int balance = lheight>rheight ? (lheight-rheight) : (rheight-lheight);
        if(balance > 1)
        {
            return false;
        }
        else
        {
            if(!isBalanced(root.left)) return false;
            if(!isBalanced(root.right)) return false;
        }
        return true;
    }
}