from typing import Dict, List


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hash_memo: List[Dict[str, int]] = []
        memo: Dict[int, List[str]] = {}

        for s in strs:
            d: Dict[str, int] = {}
            for _s in s:
                if _s in d:
                    d[_s] += 1
                else:
                    d[_s] = 1

            if d not in hash_memo:
                hash_memo.append(d)

            index = hash_memo.index(d)

            if index not in memo:
                memo[index] = []

            memo[index].append(s)

        return [val for _, val in memo.items()]
