from typing import Deque, Iterator, List, Optional

from collections import deque


class ListNode:
    def __init__(self, val: int = 0, next: Optional['ListNode'] = None) -> None:
        self.val = val
        self.next = next

    def __iter__(self) -> Iterator[int]:
        p: Optional['ListNode'] = self
        while p:
            yield p.val
            p = p.next

    @classmethod
    def from_list(cls, values: List[int], list_node: Optional['ListNode'] = None) -> Optional['ListNode']:
        if not values:
            return list_node

        current = cls(values.pop(-1))
        current.next = list_node
        return cls.from_list(values, current)


class TreeNode:
    def __init__(
            self, val: Optional[int] = 0,
            left: Optional['TreeNode'] = None, right: Optional['TreeNode'] = None,
    ) -> None:

        self.val = val
        self.left = left
        self.right = right

    def __iter__(self) -> Iterator[Optional[int]]:
        q: Deque[Optional['TreeNode']] = deque()
        q.append(self)

        while len(q) > 0:
            node = q.popleft()

            if node is not None:
                yield node.val
                q.append(node.left)
                q.append(node.right)

    @classmethod
    def from_list(cls, values: List[int]) -> 'TreeNode':
        if not values:
            return cls(None)

        if values[0] is None:
            raise ValueError('First element must NOT be `None`')

        all_nodes: Deque['TreeNode'] = deque()
        to_be_parent: List['TreeNode'] = []

        for v in values:
            node = cls(v)
            all_nodes.append(node)

            if v is not None:
                to_be_parent.append(node)

        all_nodes.popleft()
        for tbp in to_be_parent:
            if all_nodes:
                tbp.left = all_nodes.popleft()
            if all_nodes:
                tbp.right = all_nodes.popleft()

        return to_be_parent[0]
