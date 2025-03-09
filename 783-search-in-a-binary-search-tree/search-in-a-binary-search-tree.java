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
    public TreeNode searchBST(TreeNode root, int x) {
           TreeNode current=null;
      if (root == null || root.val == x)
        current = root;
      else
      if (root.val < x)
        current = searchBST(root.right, x);
      else
      if (root.val > x)
        current = searchBST(root.left, x);

      return current;
        
    }
}