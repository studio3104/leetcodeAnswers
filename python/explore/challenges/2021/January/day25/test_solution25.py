from typing import List

import pytest

from .solution import Solution


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('nums', 'k', 'expected'), (
        ([1, 0, 0, 0, 1, 0, 0, 1], 2, True),
        ([1, 0, 0, 1, 0, 1], 2, False),
        ([1, 1, 1, 1, 1], 0, True),
        ([0, 1, 0, 1], 1, True),
))
def test_solution(nums: List[int], k: int, expected: bool, solution: Solution) -> None:
    assert solution.kLengthApart(nums, k) is expected
