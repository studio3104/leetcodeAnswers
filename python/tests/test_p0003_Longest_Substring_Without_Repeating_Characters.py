from typing import List

import pytest

from p0003_Longest_Substring_Without_Repeating_Characters import Solution


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('input_value', 'expected_result'), (
))
def test_is_valid(input_value: str, expected_result: int, solution: Solution) -> None:
    assert solution.lengthOfLongestSubstring(input_value) == expected_result
