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
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        if(root == null) return res;

        Queue<Pair<TreeNode, int[]>> queue = new LinkedList<>();

        queue.offer(new Pair<>(root, new int[] {root.val, 1}));

        while(!queue.isEmpty()){
            Pair<TreeNode, int[]> current = queue.poll();
            TreeNode node = current.getKey();
            int val = current.getValue()[0];
            int level = current.getValue()[1];
            
            
            
            if(node.left != null){
                queue.offer(new Pair<>(node.left, new int[]{node.left.val , level + 1}));
            }
            if(node.right != null){
                queue.offer(new Pair<>(node.right, new int[]{node.right.val , level + 1}));
            }
            Pair<TreeNode, int[]> next = queue.peek();
            if(next == null){
                res.add(val);
                continue;
            }
            int rl = next.getValue()[1];
            if(level != rl && next != null){
                res.add(val);    
            }
            
        }
        return res;
    }
}
