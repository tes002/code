/**
 * public class TreeNode {
 *   public int key;
 *   public TreeNode left;
 *   public TreeNode right;
 *   public TreeNode(int key) {
 *     this.key = key;
 *   }
 * }
 */
 
 //method 1: interval
public class Solution {
  public boolean isBST(TreeNode root) {
    // Write your solution here.
    if (root == null){
    	return true;
    }
    return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }
  private boolean isBST(TreeNode root, int min, int max){
  	if (root == null){
    	return true;
    }
    if (root.key < max && root.key > min){
    	return isBST(root.left, min, root.key) && isBST(root.right, root.key, max);
    }
    return false;
  }
}
