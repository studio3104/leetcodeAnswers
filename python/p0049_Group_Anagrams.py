from typing import Dict, List, Tuple


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        memo: Dict[Tuple, List[str]] = {}
        a_ascii = ord('a')

        for s in strs:
            c: List[int] = [0] * 26

            for _s in s:
                c[ord(_s) - a_ascii] += 1

            tc = tuple(c)

            if tc not in memo:
                memo[tc] = []

            memo[tc].append(s)

        return [val for _, val in memo.items()]
