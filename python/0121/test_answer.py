from typing import List

import pytest

from answer import Solution


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('input_value', 'expected_result'), (
    ([7, 1, 5, 3, 6, 4], 5),
    ([7, 6, 4, 3, 1], 0),
))
def test_is_symmetric(input_value: List[int], expected_result: int, solution: Solution) -> None:
    assert solution.maxProfit(input_value) == expected_result
