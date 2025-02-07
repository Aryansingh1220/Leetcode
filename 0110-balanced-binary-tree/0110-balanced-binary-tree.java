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
    int get(TreeNode root){
        if (root == null) return 0;
        return Math.max(get(root.left), get(root.right)) + 1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int lh=get(root.left);
        int rh=get(root.right);
        if (Math.abs(lh - rh) > 1) {
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);

    }
}