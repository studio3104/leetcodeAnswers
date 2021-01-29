from typing import List, Optional


class ListNode:
    def __init__(self, x: int) -> None:
        self.val: int = x
        self.next: Optional['ListNode'] = None

    def __repr__(self) -> str:
        return (
            f'{self.__class__.__name__}('
            f'val: {self.val}, '
            f'next: {self.next}'
            ')'
        )


def create_list_node(arr: List[int], pos: int = -1) -> ListNode:
    head = ListNode(arr.pop(0))
    current = head
    pos_tree = head if pos == 0 else None

    for i, n in enumerate(arr, 1):
        current.next = ListNode(n)
        current = current.next
        if not pos_tree and i == pos:
            pos_tree = current

    current.next = pos_tree

    return head


def convert_list_node_to_list(list_node: Optional[ListNode], arr: List = []) -> List:
    if not list_node:
        return arr

    arr.append(list_node.val)
    return convert_list_node_to_list(list_node.next, arr)
