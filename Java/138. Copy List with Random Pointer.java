/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null){
            return head;
        }
        RandomListNode newHead = new RandomListNode(head.label);
        RandomListNode cur1 = head, cur2 = newHead;
        //need to establish a reference, from the old node -> the new node
        Map<RandomListNode, RandomListNode> visited = new HashMap<RandomListNode,RandomListNode>();
        visited.put(cur1, cur2);
        while(cur1.next != null){
            cur1 = cur1.next;
            cur2.next = new RandomListNode(cur1.label);
            cur2 = cur2.next;
            visited.put(cur1, cur2);
        }
        cur1 = head;
        cur2 = newHead;
        while(cur1 != null){
            if(cur1.random == null){
                cur2.random = null;
            } else {
                cur2.random = visited.get(cur1.random);
            }
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return newHead;
    }
}
