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
    public List<List<Integer>> levelOrder(TreeNode root) {
       if(root == null) return new ArrayList<>();
       List<List<Integer>> ans = new ArrayList<>();
       Queue<TreeNode> q = new LinkedList<>();
       q.offer(root);
       while(!q.isEmpty()){
        List<Integer> level= new ArrayList<>();
        int len = q.size();
        for(int i=0;i<len;i++)
        {
            TreeNode p = q.poll();
            level.add(p.val);
            if(p.left!=null) q.offer(p.left);
            if(p.right!=null) q.offer(p.right);
        }
        ans.add(level);

       } 
       return ans;
    }
}