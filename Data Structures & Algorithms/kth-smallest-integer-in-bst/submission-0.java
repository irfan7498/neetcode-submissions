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
    public int kthSmallest(TreeNode root, int k) {
        tree(root);
        if(k > arr.size()){
            return 0;
        }
        int val = arr.get(k-1);
        return  val;
    }
    public void tree(TreeNode root){
        if(root == null){
            return ;
        }
        tree(root.left);
        // tree(root);
        arr.add(root.val);
        tree(root.right); 
        return ;
    }
}
