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
    public int countGoods(TreeNode root, int max)
    {
        if(root == null)
        {
            return 0;
        }
        int maxNow = max;
        int count = 0;
        if(root.val >= max)
        {
            count++;
            maxNow = root.val;
        }
        int countLeft = countGoods(root.left, maxNow);
        int countRight = countGoods(root.right, maxNow);
        return count + countLeft + countRight;
    }

    public int goodNodes(TreeNode root) 
    {
        if(root == null)
        {
            return 0;
        }
        int count = 1;
        int countLeft = countGoods(root.left, root.val);
        int countRight =countGoods(root.right, root.val);
        return count + countLeft + countRight;       
    }
}