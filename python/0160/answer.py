# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> ListNode:
        h = set()

        while headA:
            h.add(headA)
            headA = headA.next

        while headB:
            if headB in h:
                return headB
            headB = headB.next
