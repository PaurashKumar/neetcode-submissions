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
    public boolean isValidBST(TreeNode root) {
        int L=Integer.MIN_VALUE;
        int R=Integer.MAX_VALUE;

        return check(root,L,R);
    }
    public boolean check(TreeNode root,int l,int r){

        if(root==null){
            return true;
        }
        if(!(root.val > l && root.val<r)){
            return false;
        }

        return check(root.left,l,root.val) && check(root.right,root.val,r);
    }
}
