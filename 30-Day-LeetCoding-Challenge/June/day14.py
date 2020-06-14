from typing import Dict, List, Tuple, Union, Optional

import pytest

NodeType = int
CostType = Union[int, float] 
CostsType = Dict[NodeType, CostType]
PathwaysType = Dict[NodeType, Dict[NodeType, CostType]]
ProcessedType = List[int]


def remove_excess_pathways(pathways: PathwaysType, upper_limit: int) -> PathwaysType:
    return pathways


def find_lowest_cost_node(costs: CostsType, processed: ProcessedType) -> Optional[NodeType]:
    lowest_cost: CostType = float('inf')
    lowest_cost_node: Optional[NodeType] = None

    for node in costs:
        cost = costs[node]
        if cost < lowest_cost and node not in processed:
            lowest_cost = cost
            lowest_cost_node = node

    return lowest_cost_node


class Solution:
    def findCheapestPrice(self, n: int, flights: List[List[int]], src: int, dst: int, K: int) -> CostType:
        graph: PathwaysType = {i: {} for i in range(n)}
        costs: CostsType = {dst: float('inf')}
        processed: ProcessedType = []

        for flight in flights:
            _src, _dst, _cost = tuple(flight)
            graph[_src][_dst] = _cost

        graph = remove_excess_pathways(graph, K)

        for _d, _c in graph[src].items():
            costs[_d] = _c

        node = find_lowest_cost_node(costs, processed)
        while node is not None:
            cost = costs[node]
            neighbors = graph[node]
            for n in neighbors.keys():
                new_cost = cost + neighbors[n]
                if costs[n] > new_cost:
                    costs[n] = new_cost
            processed.append(node)
            node = find_lowest_cost_node(costs, processed)

        print(graph)
        print(costs)

        return -1 if costs[dst] == float('inf') else costs[dst]


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('findCheapestPrice', ))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
        ((3, [[0, 1, 100], [1, 2, 100], [0, 2, 500]], 0, 2, 1), 200),
        ((3, [[0, 1, 100], [1, 2, 100], [0, 2, 500]], 0, 2, 0), 500),
    ))
    def test_solution(
            self, solution: Solution, method_name: str,
            input_value: Tuple[int, List[List[int]], int, int, int], expected_value: int) -> None:

        assert getattr(solution, method_name)(*input_value) == expected_value
