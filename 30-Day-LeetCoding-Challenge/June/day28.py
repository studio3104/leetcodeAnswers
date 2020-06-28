from typing import List, Dict

import pytest

import bisect


class Solution:
    def findItinerary(self, tickets: List[List[str]]) -> List[str]:
        route: Dict[str, List[str]] = {}
        for ticket in tickets:
            f, t = (ticket[0], ticket[1])
            if f not in route:
                route[f] = []
            bisect.insort(route[f], t)

        marked: List[str] = []
        itinerary: List[str] = ['JFK']

        def append_itinerary(src: str) -> str:
            _n = route[src][0]

            if len(route[src]) == 1:
                if itinerary[-1] != src:
                    itinerary.append(src)
                itinerary.append(route[src][0])
            else:
                for dst in route[src]:
                    if itinerary[-1] != src:
                        itinerary.append(src)
                    if dst in route:
                        _n = dst
                    if dst not in marked:
                        itinerary.append(dst)

            marked.append(src)
            del(route[src])
            return _n

        n = append_itinerary('JFK')
        while route:
            n = append_itinerary(n)
            if n not in route:
                break

        return itinerary


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name',  ('findItinerary', ))
    @pytest.mark.parametrize(('input_value',  'expected_value'), (
        (
            [['MUC',  'LHR'],  ['JFK',  'MUC'],  ['SFO',  'SJC'],  ['LHR',  'SFO']],
            ['JFK',  'MUC',  'LHR',  'SFO',  'SJC'],
        ),
        (
            [['JFK', 'SFO'], ['JFK', 'ATL'], ['SFO', 'ATL'], ['ATL', 'JFK'], ['ATL', 'SFO']],
            ['JFK', 'ATL', 'JFK', 'SFO', 'ATL', 'SFO'],
        ),
        (
            [['JFK', 'KUL'], ['JFK', 'NRT'], ['NRT', 'JFK']],
            ['JFK', 'KUL', 'JFK', 'NRT', 'JFK'],
        )
    ))
    def test_solution(
            self, solution: Solution, method_name: str,
            input_value: List[List[str]], expected_value: List[str]) -> None:

        assert getattr(solution,  method_name)(input_value) == expected_value
