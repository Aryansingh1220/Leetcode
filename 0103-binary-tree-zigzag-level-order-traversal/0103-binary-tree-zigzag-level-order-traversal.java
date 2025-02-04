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
     void fun(List<List<Integer>> ans, TreeNode root) {
        if (root == null) return; 
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int k=0;
        while (!q.isEmpty()) {
            int n = q.size(); 
            List<Integer> level = new ArrayList<>();
            
            for (int i = 0; i < n; i++) {
                TreeNode node = q.poll(); 
                level.add(node.val);
                if (node.right != null) {
                    q.add(node.right);
                }
                if (node.left != null) {
                    q.add(node.left);
                }
            }
            List<Integer>dumb=new ArrayList<>();
            if(k%2==0){
                for(int i=level.size()-1;i>=0;i--){
                    dumb.add(level.get(i));
                }
            }
            else {
                for(int i=0;i<level.size();i++){
                    dumb.add(level.get(i));
                }
            }
            ans.add(dumb);
            k++;
        }
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        fun(ans,root);
        return ans;
    }
}