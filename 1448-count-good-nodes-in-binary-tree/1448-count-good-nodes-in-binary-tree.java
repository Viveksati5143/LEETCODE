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
    public int goodNodes(TreeNode root) {
        return goodNodes(root, root.val);
    }
        public int goodNodes(TreeNode root, int n) {
            if(root==null) return 0;
            int p = root.val>=n ? 1 : 0;
            p += goodNodes(root.left, Math.max(n, root.val));
            p += goodNodes(root.right, Math.max(n, root.val));
            return p;
        }
}