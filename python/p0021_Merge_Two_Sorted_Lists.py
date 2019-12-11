import bisect


# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


def list_node_to_generator(list_node: ListNode):
    if list_node is None:
        return None

    yield list_node.val
    if list_node.next is not None:
        yield from list_node_to_generator(list_node.next)


def list_to_list_node(_list: list, last_list_node: ListNode = None) -> ListNode:
    if not _list:
        return last_list_node

    last_value = _list.pop()
    current_list_node = ListNode(last_value)

    if last_list_node is not None:
        current_list_node.next = last_list_node

    return list_to_list_node(_list, current_list_node)


class Solution:
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        answer = [i for i in list_node_to_generator(l1)]

        for i in list_node_to_generator(l2):
            insert_to = bisect.bisect(answer, i)
            answer.insert(insert_to, i)

        return list_to_list_node(answer)
