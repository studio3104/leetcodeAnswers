from utils import ListNode


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
