from typing import List, Tuple, Union

import pytest


class Solution:
    def calculateMinimumHP(self, dungeon: List[List[int]]) -> Union[int, float]:
        n_row = len(dungeon)
        n_col = len(dungeon[0])
        min_damages = [[float('inf')] * n_col for _ in range(n_row)]

        for i_row in reversed(range(n_row)):
            for i_col in reversed(range(n_col)):
                down = min_damages[i_row + 1][i_col] if i_row + 1 != n_row else float('inf')
                right = min_damages[i_row][i_col + 1] if i_col + 1 != n_col else float('inf')

                if isinstance(right, float) and isinstance(down, float):
                    if dungeon[i_row][i_col] >= 0:
                        min_damages[i_row][i_col] = 1
                    else:
                        min_damages[i_row][i_col] = -1 * dungeon[i_row][i_col] + 1
                else:

                    min_damages[i_row][i_col] = min(right - dungeon[i_row][i_col], down - dungeon[i_row][i_col])
                    if min_damages[i_row][i_col] <= 0:
                        min_damages[i_row][i_col] = 1

        return min_damages[0][0]

    # 23 / 45 test cases passed.
    def WAcalculateMinimumHP(self, dungeon: List[List[int]]) -> int:
        n_row = len(dungeon) - 1
        n_col = len(dungeon[0]) - 1

        def adventure(pos: Tuple[int, int], damage: int) -> Union[int, float]:
            if pos == (n_row, n_col):
                total = -1 * (damage + dungeon[pos[0]][pos[1]])
                return total if total > 0 else float('inf')

            if pos[0] < 0 or pos[0] > n_row or pos[1] < 0 or pos[1] > n_col:
                return float('inf')

            damage += dungeon[pos[0]][pos[1]]

            return min(
                adventure((pos[0] + 1, pos[1]), damage),
                adventure((pos[0], pos[1] + 1), damage),
            )

        result = adventure((0, 0), 0)
        return result + 1 if isinstance(result, int) else 1


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('calculateMinimumHP', ))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
        ([[-2, -3, 3], [-5, -10, 1], [10, 30, -5]], 7),
        ([[-3, 5]], 4),
    ))
    def test_solution(
            self, solution: Solution, method_name: str,
            input_value: List[List[int]], expected_value: int) -> None:

        assert getattr(solution, method_name)(input_value) == expected_value
