class Solution:
    """
    https://leetcode.com/problems/merge-sorted-array/?envType=study-plan-v2&envId=top-interview-150
    """
    def isIsomorphic(self, s: str, t: str) -> bool:
        m = {}
        f = [0 for _ in range(len(s))]

        for i, c in enumerate(s):
            if c not in m:
                m[c] = i
            f[i] = m[c]

        m.clear()

        for i, c in enumerate(t):
            if c not in m:
                m[c] = i

            if f[i] != m[c]:
                return False

        return True
