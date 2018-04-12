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


//method 2: in-order traversal of a BST is a ordered list.
public class Solution {
  private int lastSeen = Integer.MIN_VALUE;
  public boolean isBST(TreeNode root) {
    // Write your solution here
    if (root == null){
    	return true;
    }
    return inOrder(root);
  }
  private boolean inOrder(TreeNode root){
  	if (root == null){
    	return true;
    }
    if (!inOrder(root.left)){
    	return false;
    }
    if (root.key > lastSeen){
    	lastSeen = root.key;
      return inOrder(root.right);
    } else {
    	return false;
    }
  }
}
