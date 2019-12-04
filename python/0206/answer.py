from typing import Optional


# Definition for singly-linked list.
class ListNode:
    def __init__(self, x: int) -> None:
        self.val = x
        self.next: Optional['ListNode'] = None


def reverse_list(next_node: ListNode, current_node: Optional[ListNode]) -> ListNode:
    if not current_node:
        return next_node
    node = ListNode(current_node.val)
    node.next = next_node
    return reverse_list(node, current_node.next)


class Solution:
    def reverseList(self, head: ListNode) -> Optional[ListNode]:
        if not head:
            return None

        node = ListNode(head.val)
        return reverse_list(node, head.next)
