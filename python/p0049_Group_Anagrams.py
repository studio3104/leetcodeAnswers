from typing import Dict, List


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hash_memo: List[Dict[str, None]] = []
        memo: Dict[int, List[str]] = {}

        for s in strs:
            d = {_s: None for _s in s}

            if d not in hash_memo:
                hash_memo.append(d)

            index = hash_memo.index(d)

            if index not in memo:
                memo[index] = []

            memo[index].append(s)

        return [val for _, val in memo.items()]
