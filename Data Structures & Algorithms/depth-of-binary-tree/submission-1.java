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
//queue.offer() use to add or queue.add()
//queue.poll() use to remove element
//queue.peek() peek at head element
class Solution {
    public int maxDepth(TreeNode root) {
        Queue<Pair<TreeNode, Integer>> queue = new ArrayDeque<>();
        int max = 0 ;
        queue.offer(new Pair<>(root, 1));
        while(!queue.isEmpty()){
            Pair<TreeNode, Integer> current = queue.poll();
            TreeNode node = current.getKey();
            Integer depth = current.getValue();
            if(node != null){
                max = Math.max(max , depth);
                queue.offer(new Pair<>(node.right, depth+1));
                queue.offer(new Pair<>(node.left, depth+1));
            }
        }
        return max;
    }
}
