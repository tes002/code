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
    public boolean isBalanced(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)){
            return true;
        }
        return (Math.abs(getHeight(root.left) - getHeight(root.right)) <= 1) && isBalanced(root.left) && isBalanced(root.right);
    }
    public int getHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        return (Math.max(getHeight(root.left), getHeight(root.right)) + 1);
    }
}
