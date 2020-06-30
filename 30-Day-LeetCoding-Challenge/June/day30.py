from typing import Dict, List, Tuple

import pytest

from collections import defaultdict


class Solution:
    def findWords(self, board: List[List[str]], words: List[str]) -> List[str]:
        indexes: Dict[str, List[Tuple[int, int]]] = defaultdict(list)
        for i, b in enumerate(board):
            for j, c in enumerate(b):
                indexes[c].append((i, j))

        def find_word(word: str, start_points: List[Tuple[int, int]]) -> bool:
            def BFS(w: str, i: int, p: Tuple[int, int], m: List[Tuple[int, int]]) -> bool:
                if len(w) <= i:
                    return True

                if p in m:
                    return False
                if p[0] < 0 or p[1] < 0 or p[0] >= len(board) or p[1] >= len(board[0]):
                    return False
                if w[i] != board[p[0]][p[1]]:
                    return False

                i += 1
                m.append(p)

                return True in [
                    BFS(word, i, (p[0] + 1, p[1]), m),
                    BFS(word, i, (p[0] - 1, p[1]), m),
                    BFS(word, i, (p[0], p[1] + 1), m),
                    BFS(word, i, (p[0], p[1] - 1), m),
                ]

            if len(word) > len(board) * len(board[0]):
                return False
            return True in [BFS(word, 0, p, []) for p in start_points]

        answer: List[str] = []
        for word in words:
            initial = word[0]
            if initial not in indexes:
                continue
            if find_word(word, indexes[initial]):
                answer.append(word)

        return answer


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('findWords', ))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
        (
            (
                [
                    ['o', 'a', 'a', 'n'],
                    ['e', 't', 'a', 'e'],
                    ['i', 'h', 'k', 'r'],
                    ['i', 'f', 'l', 'v'],
                ],
                ['oath', 'pea', 'eat', 'rain'],
            ),
            ['eat', 'oath'],
        ),
        (
            (
                [
                    ['a', 'b', 'c'],
                    ['a', 'e', 'd'],
                    ['a', 'f', 'g'],
                ],
                ['abcdefg', 'gfedcbaaa', 'eaabcdgfa', 'befa', 'dgc', 'ade'],
            ),
            ['abcdefg', 'befa', 'eaabcdgfa', 'gfedcbaaa'],
        ),
        (
            (
                [["a","b"],["a","a"]],
                ["aba","baa","bab","aaab","aaa","aaaa","aaba"]
            ),
            ["aaa","aaab","aaba","aba","baa"],
        ),
    ))
    def test_solution(
            self, solution: Solution, method_name: str,
            input_value: Tuple[List[List[str]], List[str]], expected_value: List[str]) -> None:

        assert sorted(getattr(solution, method_name)(*input_value)) == sorted(expected_value)
