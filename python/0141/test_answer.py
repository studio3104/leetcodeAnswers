from typing import List, Tuple

import pytest

from answer import Solution, ListNode


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('input_value', 'expected_result'), (
    (([3, 2, 0, -4], 1), True),
    (([1, 2], 0), True),
    (([1], -1), False),
))
def test_is_symmetric(input_value: Tuple[List[int], int], expected_result: int, solution: Solution) -> None:
    arr, pos = input_value
    head = ListNode(arr.pop(0))
    current = head
    pos_tree = head if pos == 0 else None
    for i, n in enumerate(arr, 1):
        current.next = ListNode(n)
        current = current.next
        if not pos_tree and i == pos:
            pos_tree = current
    current.next = pos_tree

    assert solution.hasCycle(head) == expected_result
