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
        Stack<Integer> st=new Stack<>();
        if(root==null){
            return;
        }
        if(root.right){
            st.push(root.right);
        }
        if(root.left){
            st.push(root.left);
        }
        while(!st.empty){
            Node ans=st.peek();
            list.add(ans);
            st.pop();
        }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        fun(list,root);
        return list;
    }
}