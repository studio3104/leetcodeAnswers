from typing import List, Tuple

import pytest

from p1160_Find_Words_That_Can_Be_Formed_by_Characters import Solution


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('input_value', 'expected_result'), (
))
def test_is_valid(input_value: Tuple[List[str], str], expected_result: int, solution: Solution) -> None:
    assert solution.countCharacters(input_value) == expected_result
