from typing import Optional, List, Tuple

import pytest

from p0146_LRU_Cache import LRUCache


@pytest.mark.parametrize(('lru', 'operations', 'values', 'expects'), (
    (
        LRUCache(2),
        ('put', 'put', 'get', 'put', 'get', 'put', 'get', 'get', 'get'),
        ([1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]),
        (None, None, None, 1, None, -1, None, -1, 3, 4),
    ),
))
def test_is_valid(
        lru: LRUCache,
        operations: Tuple[str],
        values: Tuple[List[int]],
        expects: Tuple[Optional[int]]) -> None:

    for seq, operation in enumerate(operations):
        assert getattr(lru, operation)(*values[seq]) == expects[seq]
