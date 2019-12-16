from typing import List

import pytest

from p937_Reorder_Data_in_Log_Files import Solution


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('input_value', 'expected_result'), (
))
def test_is_valid(input_value: List[str], expected_result: List[str], solution: Solution) -> None:
    assert solution.reorderLogFiles(input_value) == expected_result
