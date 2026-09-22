# Remove Duplicates

## Problem

Given a sorted array, remove duplicate elements and keep only unique elements.

### Example

```text
Input:
1 1 2 2 3 4 4 5

Output:
1 2 3 4 5
```

## Approach

Since the array is sorted, duplicate elements appear next to each other.

We can use the two-pointer technique:

- `uniqueIndex` points to the last unique element.
- `i` scans the remaining elements.

Whenever a new unique element is found:

1. Move `uniqueIndex` forward.
2. Copy the new unique element to that position.

At the end, all unique elements are stored from index `0` to `uniqueIndex`.

### Example

Initial array:

```text
1 1 2 2 3 4 4 5
↑
uniqueIndex
```

When `2` is found:

```text
1 2 2 2 3 4 4 5
  ↑
uniqueIndex
```

When `3` is found:

```text
1 2 3 2 3 4 4 5
    ↑
uniqueIndex
```

When all elements are processed:

```text
1 2 3 4 5
```

The first part of the array contains all unique elements.

## Complexity

- Time Complexity: `O(n)`
- Space Complexity: `O(1)`

## Implementation

[RemoveDuplicates.java](RemoveDuplicates.java)