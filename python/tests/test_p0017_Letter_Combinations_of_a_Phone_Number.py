from typing import List

import pytest

from p0017_Letter_Combinations_of_a_Phone_Number import Solution


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('input_value', 'expected_result'), (
    ('23', ['ad', 'ae', 'af', 'bd', 'be', 'bf', 'cd', 'ce', 'cf']),
    ('234', ['adg', 'adh', 'adi', 'aeg', 'aeh', 'aei', 'afg', 'afh', 'afi', 'bdg', 'bdh', 'bdi', 'beg', 'beh', 'bei', 'bfg', 'bfh', 'bfi', 'cdg', 'cdh', 'cdi', 'ceg', 'ceh', 'cei', 'cfg', 'cfh', 'cfi']), 
))
def test_is_valid(input_value: str, expected_result: List[str], solution: Solution) -> None:
    assert sorted(solution.letterCombinations(input_value)) == sorted(expected_result)
