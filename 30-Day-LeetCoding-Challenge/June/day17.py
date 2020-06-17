from typing import List

from April.structures import TreeNode  # noqa

import pytest


class Solution:
    def solve(self, board: List[List[str]]) -> None:
        if not board or not board[0]:
            return

        row_length = len(board)
        col_length = len(board[0])

        def DFS(row: int, col: int) -> None:
            if board[row][col] != 'O':
                return

            board[row][col] = 'B'

            if row > 0:
                DFS(row - 1, col)
            if col > 0:
                DFS(row, col - 1)
            if row < row_length - 1:
                DFS(row + 1, col)
            if col < col_length - 1:
                DFS(row, col + 1)

        for ri in range(row_length):
            for ci in range(col_length):
                if ri == 0 or ci == 0 or ri == row_length - 1 or ci == col_length - 1:
                    DFS(ri, ci)

        for r in range(row_length):
            for c in range(col_length):
                board[r][c] = 'O' if board[r][c] == 'B' else 'X'


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('solve', ))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
        (
            [
                ['X', 'X', 'X', 'X'],
                ['X', 'O', 'O', 'X'],
                ['X', 'X', 'O', 'X'],
                ['X', 'O', 'X', 'X'],
            ],
            [
                ['X', 'X', 'X', 'X'],
                ['X', 'X', 'X', 'X'],
                ['X', 'X', 'X', 'X'],
                ['X', 'O', 'X', 'X'],
            ],
        ),
        (
            [
                ['X', 'X', 'X', 'X', 'X'],
                ['X', 'O', 'O', 'O', 'X'],
                ['X', 'O', 'O', 'O', 'X'],
                ['X', 'O', 'O', 'O', 'X'],
                ['X', 'X', 'X', 'X', 'X'],
            ],
            [
                ['X', 'X', 'X', 'X', 'X'],
                ['X', 'X', 'X', 'X', 'X'],
                ['X', 'X', 'X', 'X', 'X'],
                ['X', 'X', 'X', 'X', 'X'],
                ['X', 'X', 'X', 'X', 'X'],
            ],
        ),
        (
            [
                ['X', 'O', 'X', 'X', 'X'],
                ['X', 'O', 'O', 'O', 'X'],
                ['X', 'O', 'X', 'X', 'X'],
                ['X', 'X', 'O', 'O', 'X'],
                ['X', 'X', 'X', 'X', 'X'],
            ],
            [
                ['X', 'O', 'X', 'X', 'X'],
                ['X', 'O', 'O', 'O', 'X'],
                ['X', 'O', 'X', 'X', 'X'],
                ['X', 'X', 'X', 'X', 'X'],
                ['X', 'X', 'X', 'X', 'X'],
            ],
        ),
    ))
    def test_solution(
            self, solution: Solution, method_name: str,
            input_value: List[List[str]], expected_value: List[List[str]]) -> None:

        getattr(solution, method_name)(input_value)
        assert input_value == expected_value
