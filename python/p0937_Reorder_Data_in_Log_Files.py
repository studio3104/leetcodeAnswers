from typing import List


def sort_lets(lets: List[str]) -> List[str]:
    length = len(lets)

    if length < 2:
        return lets

    pivot_index = int(length / 2)
    pivot = lets[pivot_index]
    pivot_letter = ' '.join(pivot.split()[1:])
    less: List[str] = []
    greater: List[str] = []

    for i, l in enumerate(lets):
        if i == pivot_index:
            continue

        letter = ' '.join(l.split()[1:])

        if pivot_letter == letter:
            _append = greater.append if l > pivot else less.append
        else:
            _append = greater.append if letter > pivot_letter else less.append

        _append(l)

    return sort_lets(less) + [pivot] + sort_lets(greater)


class Solution:
    def reorderLogFiles(self, logs: List[str]) -> List[str]:
        digs: List[str] = []
        lets: List[str] = []

        for l in logs:
            if ''.join(l.split()[1:]).isdigit():
                digs.append(l)
            else:
                lets.append(l)

        return sort_lets(lets) + digs
