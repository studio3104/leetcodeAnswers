from typing import List

import pytest

from p0200_Number_of_Islands import Solution


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('input_value', 'expected_result'), (
    (
        [
            [1, 1, 1, 1, 0],
            [1, 1, 0, 1, 0],
            [1, 1, 0, 0, 0],
            [0, 0, 0, 0, 0],
        ],
        1,
    ),
    (
        [
            [1, 1, 0, 0, 0],
            [1, 1, 0, 0, 0],
            [0, 0, 1, 0, 0],
            [0, 0, 0, 1, 1],
        ],
        3
    ),
))
def test_is_valid(input_value: List[List[int]], expected_result: int, solution: Solution) -> None:
    assert solution.numIslands(input_value) == expected_result
