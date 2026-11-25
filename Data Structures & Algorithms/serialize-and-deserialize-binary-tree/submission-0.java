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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        String my ="";
        ArrayList<String> al=new ArrayList<>();
        Sdfs(root,al);
        return String.join(",",al);
    }
    public void Sdfs(TreeNode root,ArrayList<String> al){
        if(root==null){
            al.add("N");
            return ;
        }
        al.add(String.valueOf(root.val));
        Sdfs(root.left,al);
        Sdfs(root.right,al);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] val=data.split(",");
        int i[]={0};
         
        return Ddfs(val,i);
    }
    public TreeNode Ddfs(String[] val,int[] i){
        if(val[i[0]].equals("N")){
            i[0]++;
            return null;
        }
        TreeNode root=new TreeNode(Integer.parseInt(val[i[0]]));
        i[0]++;
        root.left=Ddfs(val,i);
        root.right=Ddfs(val,i);
        return root;
    }

}
