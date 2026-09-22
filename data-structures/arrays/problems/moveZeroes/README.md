# Move Zeroes

## Problem

Given an array, move all zeroes to the end while maintaining the relative order of the non-zero elements.

### Example

```text
Input:
0 1 0 3 12

Output:
1 3 12 0 0
```

## Approach

Use a variable called `position` to track where the next non-zero element should be placed.

### Steps

1. Initialize `position` as `0`.
2. Traverse the array.
3. Whenever a non-zero element is found:
    - Place it at `arr[position]`.
    - Increment `position`.
4. After all non-zero elements have been placed, fill the remaining positions with `0`.

### Example

Initial array:

```text
0 1 0 3 12
```

After placing non-zero elements:

```text
1 3 12 _ _
```

Fill remaining positions with zeroes:

```text
1 3 12 0 0
```

## Complexity

- Time Complexity: `O(n)`
- Space Complexity: `O(1)`

## Implementation

[MoveZeroes.java](MoveZeroes.java)