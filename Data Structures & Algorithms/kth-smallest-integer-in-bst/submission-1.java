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
    public List<Integer> arr = new ArrayList<>();
    public int i = 0;
    public int kthSmallest(TreeNode root, int k) {
        tree(root, k);
        
        return  arr.get(k-1);
    }
    public void tree(TreeNode root,int k ){
        if(root == null){
            return ;
        }
        tree(root.left, k);
        // tree(root);
        
        if(++i == k){
            arr.add(root.val);
            return ;
        }
        arr.add(root.val);
        tree(root.right, k); 
        return ;
    }
}
