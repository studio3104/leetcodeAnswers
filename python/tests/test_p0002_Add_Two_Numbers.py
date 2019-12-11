from typing import List, Tuple

import pytest

from utils import create_list_node, convert_list_node_to_list
from p0002_Add_Two_Numbers import Solution


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('input_value', 'expected_result'), (
    # (([2, 4, 3], [5, 6, 4]), [7, 0, 8]),
    # (([5], [5]), [0, 1]),
    (([1, 8], [0]), [1, 8]),
))
def test_is_valid(input_value: Tuple[List[int]], expected_result: List[int], solution: Solution) -> None:
    l1, l2 = create_list_node(input_value[0]), create_list_node(input_value[1])  # type: ignore
    result = convert_list_node_to_list(solution.addTwoNumbers(l1, l2))
    assert result == expected_result
