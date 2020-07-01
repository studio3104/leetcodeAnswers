from typing import List


class Solution:
    def countCharacters(self, words: List[str], chars: str) -> int:
        answer = []

        for word in words:
            if len(word) > len(chars):
                continue

            _chars = list(chars)
            match = True
            for w in word:
                if w not in _chars:
                    match = False
                    break
                _chars.remove(w)

            if match:
                answer.append(len(word))

        return sum(answer)
