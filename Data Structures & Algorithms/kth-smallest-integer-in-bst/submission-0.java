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
    public ArrayList<Integer> inorder(TreeNode root)
    {
        ArrayList<Integer> res = new ArrayList<>();
        res.add(root.val);
        if(root.left == null && root.right == null)
        {
            return res;
        }
        if(root.left == null)
        {
            ArrayList<Integer> right = inorder(root.right);
            res.addAll(right);
            return res;
        }
        if(root.right == null)
        {
            ArrayList<Integer> left = inorder(root.left);
            left.addAll(res);
            return left;
        }
        ArrayList<Integer> left = inorder(root.left);
        ArrayList<Integer> right = inorder(root.right);
        left.addAll(res);
        left.addAll(right);
        return left;
    }

    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> inord = inorder(root);
        return inord.get(k-1);
    }
}