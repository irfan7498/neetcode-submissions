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
    public int diameterOfBinaryTree(TreeNode root) {
        Map<TreeNode, int[]> mp = new HashMap<>();
        mp.put(null , new int[] {0,0});
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.peek();
            if(node.right != null && !mp.containsKey(node.right)){
                stack.push(node.right);
            }
            else if (node.left != null && !mp.containsKey(node.left)){
                stack.push(node.left);
            }
            else{
                node = stack.pop();
                int[] leftData = mp.get(node.left);
                int[] rightData = mp.get(node.right);

                int lHeight = leftData[0], lDia = leftData[1];
                int rHeight = rightData[0], rDia = rightData[1];

                int height = Math.max(lHeight, rHeight) + 1;
                int dia = Math.max(lHeight+rHeight, Math.max(rDia, lDia));
                mp.put(node, new int[]{height, dia}); 
            }
     
        }
        return mp.get(root)[1];
    }
}
