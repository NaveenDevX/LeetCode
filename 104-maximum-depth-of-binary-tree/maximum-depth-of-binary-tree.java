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
    public int maxDepth(TreeNode root) {
        return tree(root);

    }
     private int tree(TreeNode node)
     {
        if(node==null)
        {
            return 0;
        }
        int left=tree(node.left);
        int right=tree(node.right);
        return 1+Math.max(left,right);
     }

}