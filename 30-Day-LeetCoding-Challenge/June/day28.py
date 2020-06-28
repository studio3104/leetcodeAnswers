from typing import List, Dict

import pytest

import bisect
from collections import defaultdict


class Solution:
    def findItinerary(self, tickets: List[List[str]]) -> List[str]:
        route: Dict[str, List[str]] = defaultdict(list)
        marked: Dict[str, List[int]] = defaultdict(list)

        for ticket in tickets:
            bisect.insort(route[ticket[0]], ticket[1])

        def find_route(departure: str, itinerary: List[str]) -> bool:
            if len(itinerary) == len(tickets) + 1:
                self.result = itinerary
                return True

            for i, destination in enumerate(route[departure]):
                if i not in marked[departure]:
                    marked[departure].append(i)
                    res = find_route(destination, itinerary + [destination])
                    marked[departure].remove(i)
                    print(f'res: {res}, departure: {departure}, destination: {destination}, itinerary: {itinerary}')
                    if res:
                        return True

            return False

        print()
        find_route('JFK', ['JFK'])
        return self.result


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name',  ('findItinerary', ))
    @pytest.mark.parametrize(('input_value',  'expected_value'), (
        # (
        #     [['MUC',  'LHR'],  ['JFK',  'MUC'],  ['SFO',  'SJC'],  ['LHR',  'SFO']],
        #     ['JFK',  'MUC',  'LHR',  'SFO',  'SJC'],
        # ),
        # (
        #     [['JFK', 'SFO'], ['JFK', 'ATL'], ['SFO', 'ATL'], ['ATL', 'JFK'], ['ATL', 'SFO']],
        #     ['JFK', 'ATL', 'JFK', 'SFO', 'ATL', 'SFO'],
        # ),
        # (
        #     [['JFK', 'KUL'], ['JFK', 'NRT'], ['NRT', 'JFK']],
        #     ['JFK', 'NRT', 'JFK', 'KUL'],
        # ),
        (
            [['JFK', 'KUL'], ['JFK', 'NRT'], ['NRT', 'JFK'], ['JFK', 'NRT'], ['NRT', 'JFK']],
            ['JFK', 'NRT', 'JFK', 'NRT', 'JFK', 'KUL'],
        ),
    ))
    def test_solution(
            self, solution: Solution, method_name: str,
            input_value: List[List[str]], expected_value: List[str]) -> None:

        assert getattr(solution,  method_name)(input_value) == expected_value
