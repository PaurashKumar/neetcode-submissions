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

        Queue<TreeNode> q=new LinkedList<>();
        if(root!=null){
        q.offer(root);
        }

        int level=0;


        while(!q.isEmpty()){
            int s=q.size();

            for(int i=0;i<s;i++){
                TreeNode tmp=q.poll();
                if(tmp.left!=null){
                    q.offer(tmp.left);
                }
                if(tmp.right!=null){
                    q.offer(tmp.right);
                }
            }
            level++;
        }
        return level;
    }
}
