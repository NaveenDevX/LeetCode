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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       if(root == null) return new ArrayList<>();
       List<List<Integer>> res= new ArrayList<>();
       Deque<TreeNode> q= new LinkedList<>();
       q.offer(root);
       boolean flag = false;
       while(!q.isEmpty()){
        int len = q.size();
        List<Integer>ans = new ArrayList<>();
        for(int i=0;i<len;i++){
            if(!flag){
                TreeNode p = q.pollFirst();
                ans.add(p.val);
                if(p.left!=null){
                    q.addLast(p.left);
                }
                if(p.right!=null){
                    q.addLast(p.right);
                }
            }
            else{
                TreeNode p = q.pollLast();
                ans.add(p.val);
                if(p.right!=null){
                    q.addFirst(p.right);
                }
                if(p.left!=null){
                    q.addFirst(p.left);
                }
            }
        }
        flag=!flag;
        res.add(ans);

       }
       return res;
 
    }
}