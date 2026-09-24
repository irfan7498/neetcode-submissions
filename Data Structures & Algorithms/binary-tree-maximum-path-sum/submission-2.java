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
    int res = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return res;
    }
    public int helper(TreeNode root){
        if(root == null){
            return 0;
        }
        int right = helper(root.right);
        int left = helper(root.left);

        int x = Math.max(root.val, right+left+root.val);
        int y = Math.max(left + root.val, right + root.val);
        int max = Math.max(x, y);
        res = Math.max(res, max);

        return Math.max(Math.max(right, left) + root.val, root.val);
    }
}
