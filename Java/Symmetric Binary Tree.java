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
  public boolean isSymmetric(TreeNode root) {
    // Write your solution here.
    boolean result = isSymmetric(root, root);
    return result;
  }
  public boolean isSymmetric(TreeNode A, TreeNode B){
  	if (A == null && B == null) {
    	return true;
    }
    if (A == null || B == null){
    	return false; // can't access null tree node -> null pointer exception
    }
    if (A.key != B.key){
    	return false;
    }
    return isSymmetric(A.right, B.left) && isSymmetric(A.left, B.right);    
  }
  
}
