from typing import List, Tuple

import pytest


class Solution:
    def reconstructQueue(self, people: List[List[int]]) -> List[List[int]]:
        arranged: List[List[int]] = []

        # DESC by the height, ASC by the number of people in front of this person
        for person in sorted(people, key=lambda x: (x[0] * -1, x[1])):
            arranged.insert(person[1], person)

        return arranged


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('reconstructQueue', ))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
        (
            [[7, 0], [4, 4], [7, 1], [5, 0], [6, 1], [5, 2]],
            [[5, 0], [7, 0], [5, 2], [6, 1], [4, 4], [7, 1]],
        ),
        (
            [[6, 0], [5, 0], [4, 0], [3, 2], [2, 2], [1, 4]],
            [[4, 0], [5, 0], [2, 2], [3, 2], [1, 4], [6, 0]],
        ),
    ))
    def test_solution(
            self, solution: Solution, method_name: str,
            input_value: List[List[int]], expected_value: List[List[int]]) -> None:

        assert getattr(solution, method_name)(input_value) == expected_value
