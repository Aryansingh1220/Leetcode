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
    boolean fun(TreeNode root, int k,HashSet<Integer>set){
        if(root ==null){
            return false;
        }
        if(set.contains(k-root.val)){
            return true;
        }
        set.add(root.val);
        return fun(root.left,k,set)||fun(root.right,k,set);
    }
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer>set=new HashSet<>();
        return fun(root,k,set);
    }
}