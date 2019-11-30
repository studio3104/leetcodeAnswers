from typing import Dict, List, Set


cache: Dict[str, Set[str]] = {
    '2': {'a', 'b', 'c'},
    '3': {'d', 'e', 'f'},
    '4': {'g', 'h', 'i'},
    '5': {'j', 'k', 'l'},
    '6': {'m', 'n', 'o'},
    '7': {'p', 'q', 'r', 's'},
    '8': {'t', 'u', 'v'},
    '9': {'w', 'x', 'y', 'z'},
}


def fetch_letters(digits1: str, digits2: str) -> Set[str]:
    d = f'{digits1}{digits2}'
    if d in cache:
        return cache[d]

    letters = set()
    for l1 in cache[digits1]:
        for l2 in cache[digits2]:
            letters.add(f'{l1}{l2}')

    cache[d] = letters
    return letters


def generate_letters(digits: List[str]) -> Set[str]:
    d1 = digits.pop(0)
    d2 = digits.pop(0)

    if len(d1) < len(d2):
        digits.append(d1)
        d1 = d2
        d2 = digits.pop(0)

    letters = fetch_letters(d1, d2)

    if not digits:
        return letters

    digits.append(f'{d1}{d2}')
    return generate_letters(digits)


class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        if not digits:
            return []
        if len(digits) == 1:
            return list(cache[digits])
        return list(generate_letters(list(digits)))
