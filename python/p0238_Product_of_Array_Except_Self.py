from typing import Dict, List, Tuple
import pytest
import re


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        pass


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('input_value', 'expected_result'), (
    ([1, 2, 3, 4], [24, 12, 8, 6]),
))
def test_is_valid(input_value: List[int], expected_result: List[int], solution: Solution) -> None:
    assert solution.productExceptSelf(input_value) == expected_result
