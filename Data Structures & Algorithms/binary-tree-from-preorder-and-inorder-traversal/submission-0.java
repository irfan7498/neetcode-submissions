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
    public Map<Integer, Integer> idx = new HashMap<>();
    public int i = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        for (int j = 0 ; j < inorder.length; j++){
            idx.put(inorder[j] , j);
        }
        TreeNode root = helper(preorder , 0 , preorder.length-1);
        return root;
    }
    public TreeNode helper(int[] preorder, int inStart , int end){

        if ( inStart > end){
            return null;
        }        
        int val = preorder[i++];
        TreeNode root = new TreeNode(val);
        root.left = helper(preorder, inStart, idx.get(val)-1);
        root.right = helper(preorder, idx.get(val)+1 ,end);
        return root;
    }
}
