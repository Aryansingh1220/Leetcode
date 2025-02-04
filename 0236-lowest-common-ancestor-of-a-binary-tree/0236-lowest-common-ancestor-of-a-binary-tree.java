/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode fun(TreeNode root, TreeNode p, TreeNode q){
        if(root == null){
            return root;
        }
        if (root ==p || root==q){
            return root;
        }
        TreeNode left=fun(root.left,p,q);
        TreeNode right=fun(root.right,p,q);
        if(left==null){
            return right;
        }
        else if(right==null){
            return left;
        }
        else{
            return root;
        }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return fun(root,p,q);
    }
}