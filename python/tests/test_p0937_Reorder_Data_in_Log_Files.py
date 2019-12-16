from typing import List

import pytest

from p0937_Reorder_Data_in_Log_Files import Solution


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('input_value', 'expected_result'), (
    (
        ['dig1 8 1 5 1', 'let1 art can', 'dig2 3 6', 'let2 own kit dig', 'let3 art zero'],
        ['let1 art can', 'let3 art zero', 'let2 own kit dig', 'dig1 8 1 5 1', 'dig2 3 6'],
    ),
    (
        ['a1 9 2 3 1', 'g1 act car', 'zo4 4 7', 'ab1 off key dog', 'a8 act zoo'],
        ['g1 act car', 'a8 act zoo', 'ab1 off key dog', 'a1 9 2 3 1', 'zo4 4 7'],
    ),
    (
        ['j mo', '5 m w', 'g 07', 'o 2 0', 't q h'],
        ['5 m w', 'j mo', 't q h', 'g 07', 'o 2 0'],
    ),
))
def test_is_valid(input_value: List[str], expected_result: List[str], solution: Solution) -> None:
    assert solution.reorderLogFiles(input_value) == expected_result
