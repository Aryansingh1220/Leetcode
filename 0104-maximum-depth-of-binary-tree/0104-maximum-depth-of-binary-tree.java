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
        int height1=0;
        int height2=0;
        TreeNode leftnode=root;
        TreeNode rightnode=root;
        while(leftnode!=null){
            height1++;
            leftnode=leftnode.left;
        }
        while(rightnode!=null){
            height2++;
            rightnode=rightnode.right;
        }
        return Math.max(height1,height2);

    }
}