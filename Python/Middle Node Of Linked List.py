# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None
# return the n/2 th node when n is even
class Solution(object):
  def middleNode(self, head):
    """
    input: ListNode head
    return: ListNode
    """
    # write your solution here
    if head is None:
      return None
    fast = head
    slow = head
    while fast.next and fast.next.next: 
      slow = slow.next
      fast = fast.next.next
    return slow
