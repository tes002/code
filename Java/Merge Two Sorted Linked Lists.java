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
  public ListNode merge(ListNode one, ListNode two) {
    // write your solution here
    ListNode dummy = new ListNode(0);
    ListNode cur = dummy;
    ListNode cur1 = one;
    ListNode cur2 = two;
    while (cur1 != null && cur2 != null){
    	if (cur1.value <= cur2.value){
      	cur.next = cur1;
        cur = cur1;
        cur1 = cur1.next;
      } else {
      	cur.next = cur2;
        cur = cur2;
        cur2 = cur2.next;
      }
    }
    if(cur1 == null){
    	cur.next = cur2;
    }
		if(cur2 == null){
    	cur.next = cur1;
    }    
    return dummy.next;
  }
}
