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
    public int result = Integer.MIN_VALUE;
    public HashMap<TreeNode, Integer> map = new HashMap<>();

    public int noSplit(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }
        int left = Math.max(noSplit(root.left), 0);
        int right = Math.max(noSplit(root.right), 0);
        int curr = root.val + left + right;
        result = Math.max(curr, result);
        return (root.val + Math.max(left, right));
    }

    public int maxPathSum(TreeNode root) {
        int s = noSplit(root);
        return result;
    }
}