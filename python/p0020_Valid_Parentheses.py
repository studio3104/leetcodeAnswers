openers = ['(', '{', '[']
closers = [')', '}', ']']


class Solution:
    def isValid(self, s: str) -> bool:
        if not s:
            return True

        stack = []

        for p in list(s):
            if p in openers:
                stack.append(p)
                continue

            if not stack:
                return False

            last_one = stack.pop()
            idx = openers.index(last_one)
            if p != closers[idx]:
                return False

        return not stack
