/**
* Definition for a binary tree node.
* public class TreeNode {
*     int val;
*     TreeNode left;
*     TreeNode right;
*     TreeNode(int x) { val = x; }
* }
*/
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }
        return helper(root.left, root.right);
    }
    private boolean helper (TreeNode node1, TreeNode node2){
        if (node1 == null && node2 == null){
            return true;
        }
        if ((node1 == null && node2 != null) || (node1 != null && node2 == null)){
            return false;
        }
        return ((node1.val == node2.val) && helper(node1.left, node2.right) && helper(node1.right, node2.left));
    }
}
