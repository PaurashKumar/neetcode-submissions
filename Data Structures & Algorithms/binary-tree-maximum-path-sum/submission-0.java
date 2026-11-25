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
    public int maxPathSum(TreeNode root) {
        int ans[]=new int[]{root.val};
        dfs(root,ans);
        return ans[0];
    }
    public int dfs(TreeNode root,int ans[]){
        if(root==null){
            return 0;
        }
        int leftmax=dfs(root.left,ans);
        int rightmax=dfs(root.right,ans);
        leftmax=Math.max(leftmax,0);
        rightmax=Math.max(rightmax,0);
        ans[0]=Math.max(ans[0],root.val+leftmax+rightmax);
        
        return root.val+Math.max(leftmax,rightmax);

    }
}
