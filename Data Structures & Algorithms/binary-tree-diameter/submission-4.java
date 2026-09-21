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
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return max;
    }
    public int helper(TreeNode node){
        if(node == null){
            return 0;
        }

        int rDepth = helper(node.right);
        int lDepth = helper(node.left);
        max = Math.max(rDepth + lDepth, max);
        return Math.max(rDepth,lDepth) + 1;
    }
}
