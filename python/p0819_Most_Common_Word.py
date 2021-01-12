import re
from collections import Counter
from typing import List, Tuple

import pytest

PUNCTUATION_PATTERN = re.compile(r"[!\?',;\.]+")


class Solution:
    def mostCommonWord(self, paragraph: str, banned: List[str]) -> str:
        answer = ''
        words = re.sub(PUNCTUATION_PATTERN, ' ', paragraph.lower()).split(' ')
        counter = Counter(words)
        for word, count in counter.most_common():
            if not word or word in banned:
                continue
            answer = word
            break
        return answer


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('input_value', 'expected_result'), (
    (
        ('Bob hit a ball, the hit BALL flew far after it was hit.', ['hit']),
        'ball',
    ),
    (
        ('a, a, a, a, b,b,b,c, c', ['a']),
        'b',
    ),
))
def test_is_valid(input_value: Tuple[str, List[str]], expected_result: str, solution: Solution) -> None:
    assert solution.mostCommonWord(*input_value) == expected_result
