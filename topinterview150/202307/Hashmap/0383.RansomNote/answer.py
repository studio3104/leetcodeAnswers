class Solution:
    """
    https://leetcode.com/problems/merge-sorted-array/?envType=study-plan-v2&envId=top-interview-150
    """
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        m = {}
        for c in magazine:
            if c not in m:
                m[c] = 0
            m[c] += 1

        for c in ransomNote:
            if c not in m or m[c] == 0:
                return False
            m[c] -= 1

        return True
