from typing import Dict, List, Tuple

import pytest


def is_reachable_all(n: int, connections: List[List[int]]) -> bool:
    neighbors: Dict[int, List[int]] = {i: [] for i in range(n)}

    for c in connections:
        neighbors[c[0]].append(c[1])
        neighbors[c[1]].append(c[0])

    visited = [False for _ in range(n)]
    peers = []

    def DFS(t: List[int], i: int) -> List[int]:
        visited[i] = True
        t.append(i)

        for node in neighbors[i]:
            if not visited[node]:
                t = DFS(t, node)
        return t

    for i in range(n):
        if not visited[i]:
            t: List[int] = []
            peers.append(DFS(t, i))

    return len(peers) == 1


class Solution:
    def criticalConnections(self, n: int, connections: List[List[int]]) -> List[List[int]]:
        result: List[List[int]] = []

        for i in range(len(connections)):
            if not is_reachable_all(n, connections[:i] + connections[i + 1:]):
                result.append(connections[i])

        return result


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('input_value', 'expected_result'), (
    ((4, [[0, 1], [1, 2], [2, 0], [1, 3]]), [[1, 3]]),
    ((6, [[0, 1], [1, 2], [2, 0], [1, 3], [3, 4], [4, 5], [5, 3]]), [[1, 3]]),
))
def test_is_valid(input_value: Tuple[int, List[List[int]]], expected_result: List[int], solution: Solution) -> None:
    assert sorted(solution.criticalConnections(*input_value)) == sorted(expected_result)
