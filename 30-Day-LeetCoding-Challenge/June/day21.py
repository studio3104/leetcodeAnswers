from typing import List, Tuple, Set, Union

import pytest


class Solution:
    def calculateMinimumHP(self, dungeon: List[List[int]]) -> int:
        n_row = len(dungeon) - 1
        n_col = len(dungeon[0]) - 1

        def DFS(pos: Tuple[int, int], damage: int, marked: Set[Tuple[int, int]]) -> Union[int, float]:
            if pos == (n_row, n_col):
                return damage + dungeon[pos[0]][pos[1]]

            is_out = pos[0] < 0 or pos[0] > n_row or pos[1] < 0 or pos[1] > n_col
            if is_out or pos in marked:
                return float('inf')

            damage += dungeon[pos[0]][pos[1]]
            marked.add(pos)

            return min(
                DFS((pos[0] + 1, pos[1]), damage, marked),
                DFS((pos[0] - 1, pos[1]), damage, marked),
                DFS((pos[0], pos[1] + 1), damage, marked),
                DFS((pos[0], pos[1] - 1), damage, marked),
            )

        return int(DFS((0, 0), 0, set()))


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('calculateMinimumHP', ))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
        ([[-2, -3, 3], [-5, -10, 1], [10, 30, -5]], 7),
    ))
    def test_solution(
            self, solution: Solution, method_name: str,
            input_value: List[List[int]], expected_value: int) -> None:

        assert getattr(solution, method_name)(input_value) == expected_value
