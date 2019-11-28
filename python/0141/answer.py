# Definition for singly-linked list.
class ListNode:
    def __init__(self, x: int) -> None:
        self.val = x
        self.next = None

    def __repr__(self) -> str:
        return (
            f'{self.__class__.__name__}('
            f'val: {self.val}, '
            f'next: {self.next}'
            ')'
        )


class Solution:
    def __init__(self) -> None:
        self.memo = {}  # type: ignore

    def hasCycle(self, head: ListNode) -> bool:
        if head is None:
            return False

        if head in self.memo:
            return True

        self.memo[head] = None

        return self.hasCycle(head.next)  # type: ignore
