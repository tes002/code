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
  public ListNode reverseIteratively(ListNode head) {
    // write your solution here
    if (head == null || head.next == null) {
        return head;
    }
    ListNode prev = null, cur = head, next = null;
    while(cur != null){
        next = cur.next;
      cur.next = prev;
      prev = cur;
      cur = next;
      // don't write next = next.next here: it should be in the next iteration
    }
    return prev; // cur is null here
  }
  public ListNode reverseRecursively(ListNode head) {
  
  
  
  }
}
