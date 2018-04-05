/**
 * class ListNode {
 *   public int value;
 *   public ListNode next;
 *   public ListNode(int value) {
 *     this.value = value;
 *     next = null;
 *   }
 * }
 */
public class Solution {
  public boolean hasCycle(ListNode head) {
    // write your solution here
    if (head == null) {
    	return false;
    }
    ListNode slow = head, fast = head;
    while (fast!=null && fast.next != null){
    	slow = slow.next;
      fast = fast.next.next;
      if (fast == slow){
      	return true;
      }
    }
    return false;
  }
}
