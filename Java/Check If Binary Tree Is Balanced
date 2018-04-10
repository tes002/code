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
public class Solution {
  public boolean isBalanced(TreeNode root) {
    // Write your solution here.
    if (root == null){
    	return true;
    }
    boolean left = isBalanced(root.left);
    boolean right = isBalanced(root.right);
    int diff = Math.abs(getHeight(root.left) - getHeight(root.right));
    return (left && right && (diff <= 1)) ;
  }
 
  private int getHeight(TreeNode root){
  	if (root == null){
    	return 0;
    }
    int height = Math.max(getHeight(root.left), getHeight(root.right))+1;
    return height;
  }
}

// the getHeight method could be improved, without using recursion.
