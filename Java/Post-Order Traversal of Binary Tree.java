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
 
//Recursion
public class Solution {
  public List<Integer> postOrder(TreeNode root) {
    // Write your solution here.
    List<Integer> postResult = new ArrayList<Integer>();
    helper(root, postResult);
    return postResult;
  }
  public void helper(TreeNode root, List<Integer> postResult){
  	if (root == null) {
    	return;
    }
    helper(root.left, postResult);
    helper(root.right, postResult);
    postResult.add(root.key);
  }
  
}


//Iteration
