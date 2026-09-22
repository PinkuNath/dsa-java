# Merge Sorted Arrays

## Problem

Given two sorted arrays, merge them into a single sorted array.

### Example

```text id="4o8kyw"
Array 1:
1 3 5

Array 2:
2 4 6

Output:
1 2 3 4 5 6
```

## Approach

Use three pointers:

- `i` traverses the first array.
- `j` traverses the second array.
- `k` stores elements in the merged array.

Compare the current elements of both arrays:

- If `arr1[i]` is smaller, place it in the merged array.
- Otherwise, place `arr2[j]`.

After one array is exhausted, copy the remaining elements from the other array.

### Example

Initial:

```text id="b2e5yv"
arr1: 1 3 5
      ↑

arr2: 2 4 6
      ↑

merged:
↑
```

Compare:

```text id="m0f37n"
1 and 2
```

Take the smaller value:

```text id="jm8iwf"
merged: 1
```

Move `i` and `k`.

Continue until one array is fully processed.

Copy the remaining elements.

Final result:

```text id="ql6rpo"
1 2 3 4 5 6
```

## Complexity

- Time Complexity: `O(n + m)`
- Space Complexity: `O(n + m)`

where:

- `n` = size of first array
- `m` = size of second array

## Implementation

[MergeSortedArrays.java](MergeSortedArrays.java)