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
  public ListNode insert(ListNode head, int value) {
    // write your solution here
    ListNode Newhead = new ListNode(value);
    if (head == null || value <= head.value){
        
      Newhead.next = head;
      return Newhead;
    }
    ListNode prev = null;
    ListNode cur = head;
    while (cur!= null){
        if (cur.value < value){
          prev = cur;
        cur = cur.next;
      } else {
              Newhead.next = cur;
        prev.next = Newhead;
        return head;
      }
    }
    prev.next = Newhead;
    return head;
  }
}
