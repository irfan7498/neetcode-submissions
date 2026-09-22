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
    boolean flag = true;
    public boolean isBalanced(TreeNode root) {
        helper(root);
        return flag;
    }
    int helper(TreeNode root){
        if(root == null){
            return 0;
        }
        
        
        int r = helper(root.right);
        int l = helper(root.left);

        int diff = l - r ;
        if (diff < 0) diff = - diff;
        if(diff > 1){
            flag = false;
        }
        
        return Math.max(r, l) + 1;
    }
}
