from typing import List, Tuple

import pytest


class Solution:
    def criticalConnections(self, n: int, connections: List[List[int]]) -> List[List[int]]:
        pass


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('input_value', 'expected_result'), (
    ((4, [[0, 1], [1, 2], [2, 0], [1, 3]]), [[1, 3]]),
))
def test_is_valid(input_value: Tuple[int, List[List[int]]], expected_result: List[int], solution: Solution) -> None:
    assert sorted(solution.criticalConnections(*input_value)) == sorted(expected_result)
