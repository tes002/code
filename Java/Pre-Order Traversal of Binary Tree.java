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
 
 //Recursive
public class Solution {
  public List<Integer> preOrder(TreeNode root) {
    // Write your solution here.
    List<Integer> preResult = new ArrayList<Integer>();
    helper(root, preResult);
    return preResult;
  }
  public void helper(TreeNode root, List<Integer> preResult){
  	if (root == null){
    	return;
    }
    preResult.add(root.key);
    helper(root.left, preResult);
    helper(root.right, preResult);
  }
}


//Iteration
