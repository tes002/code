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
  public List<Integer> inOrder(TreeNode root) {
    // Write your solution here.
    List<Integer> inResult = new ArrayList<Integer>();
    helper(root, inResult);
    return inResult;
  }
  
  public void helper(TreeNode root, List<Integer> inResult){
  	if (root == null){
    	return;
    }
    helper(root.left, inResult);
    inResult.add(root.key);
    helper(root.right, inResult);
  }
}
