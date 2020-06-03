from typing import Dict, List

import pytest


class Solution:
    def twoCitySchedCost(self, costs: List[List[int]]) -> int:
        diff: Dict[int, int] = {}
        for i, c in enumerate(costs):
            diff[i] = abs(c[0] - c[1])

        costs = [costs[i] for i, _ in sorted(diff.items(), key=lambda x: x[1], reverse=True)]

        length = len(costs)
        remain_a = length / 2
        remain_b = length / 2

        result: List[int] = []

        for cost in costs:
            if remain_a > 0 and cost[0] <= cost[1]:
                result.append(cost[0])
                remain_a -= 1
                continue

            if remain_b > 0 and cost[1] <= cost[0]:
                result.append(cost[1])
                remain_b -= 1
                continue

            if remain_a > 0:
                result.append(cost[0])
                remain_a -= 1
                continue

            if remain_b > 0:
                result.append(cost[1])
                remain_b -= 1
                continue

        return sum(result)


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('twoCitySchedCost', ))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
        ([[10, 20], [30, 200], [400, 50], [30, 20]], 110),
        ([[259, 770], [448, 54], [926, 667], [184, 139], [840, 118], [577, 469]], 1859),
    ))
    def test_solution(
            self, solution: Solution, method_name: str,
            input_value: List[List[int]], expected_value: int) -> None:

        assert getattr(solution, method_name)(input_value) == expected_value
