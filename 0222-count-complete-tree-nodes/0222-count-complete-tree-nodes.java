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
    int preorder(TreeNode root,List<Integer>list){
        if(root==null){
            return 0;
        }
        list.add(root.val);
        preorder(root.left,list);
        preorder(root.right,list);
        int ans=list.size();
        return ans;
    }
    public int countNodes(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        int count=preorder(root,list);
        return count;
        
    }
}