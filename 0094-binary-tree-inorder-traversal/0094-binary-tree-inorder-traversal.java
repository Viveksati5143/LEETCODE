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
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return new ArrayList<Integer>();
        List<Integer> res = new ArrayList<Integer>();
        TreeNode pre = null;
        while(root != null){
        	if(root.left == null){
        		res.add(root.val);
        		root = root.right;
        	}else{
        		pre = root.left;
        		while(pre.right != null && pre.right != root){
        			pre = pre.right;
        		}
        		if(pre.right == null){
        			pre.right = root;
        			root = root.left;
        		}else{
        			pre.right = null;
        			res.add(root.val);
        			root = root.right;
        		}
        	}
        }
        return res;
    }
}