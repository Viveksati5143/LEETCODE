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
// class Solution {        
//     public int diameterOfBinaryTree(TreeNode root) {
//         if(root == null) return 0;
// 		int dia1 = diameterOfBinaryTree(root.left);
// 		int dia2 = diameterOfBinaryTree(root.right);
// 		int dia3 = Height(root.left) + Height(root.right);		
// 		return Math.max(dia3, Math.max(dia1, dia2));        
//     }
//     public static int Height(TreeNode root) {
// 		if(root == null) return 0;
// 		int leftHeight = Height(root.left);
// 		int rightHeight = Height(root.right);
// 		int myHeight = Math.max(leftHeight, rightHeight) + 1;
// 		return myHeight;
//     }
// }
public class Solution {
    int max = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return max;
    }
    
    private int maxDepth(TreeNode root) {
        if (root == null) return 0;
        
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        
        max = Math.max(max, left + right);
        
        return Math.max(left, right) + 1;
    }
}