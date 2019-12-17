from typing import List

import pytest

from p0049_Group_Anagrams import Solution


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('input_value', 'expected_result'), (
    (
        ['eat', 'tea', 'tan', 'ate', 'nat', 'bat'],
        [
              ['eat', 'tea', 'ate'],
              ['tan', 'nat'],
              ['bat'],
        ],
    ),
))
def test_is_valid(input_value: List[str], expected_result: List[List[str]], solution: Solution) -> None:
    assert solution.groupAnagrams(input_value) == expected_result
