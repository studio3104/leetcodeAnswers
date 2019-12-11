from typing import List, Tuple

import pytest

from utils import create_list_node
from p0141_Linked_List_Cycle import Solution


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
    head = create_list_node(arr, pos)

    assert solution.hasCycle(head) == expected_result
