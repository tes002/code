/** 
 *Reorder the given singly-linked list 
 *N1 -> N2 -> N3 -> N4 -> … -> Nn -> null to be N1- > Nn -> N2 -> Nn-1 -> N3 -> Nn-2 -> … -> null


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

//1. Use fast / slow pointer to find mid point; reverse second half; merge 2 linkedlists.
public class Solution {
  public ListNode reorder(ListNode head) {
    // Write your solution here
    if (head == null || head.next == null){
    	return head;
    }
    ListNode fast = head, slow = head;
    while(fast.next != null && fast.next.next != null){
    	slow = slow.next;
      fast = fast.next.next;
    }
    // slow.next is the head of second half
    ListNode secondHalf = slow.next;
    slow.next = null; // !!DE-LINK THE SECOND HALF: middle.next = null
    
    ListNode secondHead = reverse(secondHalf);
    mergeLinkedList(head, secondHead);
    return head;
  }
  private ListNode reverse(ListNode head){
  	if (head.next == null){
    	return head;
    }
    ListNode prev = null, cur = head, next;
    while (cur != null){
    	next = cur.next;
      cur.next = prev;
      prev = cur;
      cur = next;
    }
    return prev;
  }
  //merge 2 linkedlists, head is the hew head
  private void mergeLinkedList(ListNode head, ListNode secondHead){
  	ListNode first = head;
    ListNode second = secondHead;
    ListNode cur = head;
    while(first != null && first.next != null && second != null){
      first = first.next;
    	cur.next = second;
      second = second.next;
      cur.next.next = first;
      cur = first;
    }
    if (first.next == null){
    	cur.next = second;
    } //(second is null and first.next not null) won't happen: length difference <=1
    	
    //return head;
  }
 
}
