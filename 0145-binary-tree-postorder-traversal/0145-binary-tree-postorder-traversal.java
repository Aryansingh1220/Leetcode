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
    void fun(List<Integer> list,TreeNode root){
        if(root==null){
            return;
        }
        list.add(root.val);
        fun(list,root.right);
        fun(list,root.left);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        fun(list,root);
        for(int i=list.size()-1;i>=0;i--){
            ans.add(list.get(i));
        }
        return ans;
    }
}