from typing import Dict, List, Set, Tuple

import pytest


class Solution:
    def criticalConnections(self, n: int, connections: List[List[int]]) -> List[List[int]]:
        hm: Dict[int, Set[int]] = {}

        for c in connections:
            if c[0] not in hm:
                hm[c[0]] = set()
            if c[1] not in hm:
                hm[c[1]] = set()

            hm[c[0]].add(c[1])
            hm[c[1]].add(c[0])

        result: List[List[int]] = []

        for node, neighbors in hm.items():
            if len(neighbors) == 1:
                result.append([node, neighbors.pop()])

        return result


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('input_value', 'expected_result'), (
    ((4, [[0, 1], [1, 2], [2, 0], [1, 3]]), [[3, 1]]),
    ((6, [[0, 1], [1, 2], [2, 0], [1, 3], [3, 4], [4, 5], [5, 3]]), [[1, 3]]),
))
def test_is_valid(input_value: Tuple[int, List[List[int]]], expected_result: List[int], solution: Solution) -> None:
    assert sorted(solution.criticalConnections(*input_value)) == sorted(expected_result)
