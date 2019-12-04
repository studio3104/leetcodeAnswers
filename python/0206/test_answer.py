from typing import List

import pytest

from answer import Solution, ListNode


def create_list_node(arr: List[int]) -> ListNode:
    head = ListNode(arr.pop(0))
    current = head

    for n in arr:
        current.next = ListNode(n)
        current = current.next

    return head


def convert_node_list_to_list(node_list: ListNode, converted: list = []) -> List:
    if not node_list:
        return converted

    converted.append(node_list.val)
    return convert_node_list_to_list(node_list.next)


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('input_value', 'expected_result'), (
    ([1, 2, 3, 4, 5], [5, 4, 3, 2, 1]),
))
def test_is_symmetric(input_value: List[int], expected_result: List[int], solution: Solution) -> None:
    original = create_list_node(input_value)
    assert convert_node_list_to_list(solution.reverseList(original)) == expected_result
