from typing import List, Optional


class ListNode:
    def __init__(self, val: int = 0, next: Optional['ListNode'] = None) -> None:
        self.val = val
        self.next = next

    @classmethod
    def from_list(cls, values: List[int], list_node: Optional['ListNode'] = None) -> Optional['ListNode']:
        if not values:
            return list_node

        current = cls(values.pop(-1))
        current.next = list_node
        return cls.from_list(values, current)
