# Rotate Array

## Problem

Given an array, rotate the array to the left by one position.

### Example

```text id="uqry2t"
Input:
10 20 30 40 50

Output:
20 30 40 50 10
```

## Approach

To rotate an array left by one position:

1. Store the first element.
2. Shift all remaining elements one position to the left.
3. Place the stored element at the last index.

### Example

Initial array:

```text id="ksx8hg"
10 20 30 40 50
```

Store the first element:

```text id="i5uzku"
firstElement = 10
```

Shift all elements left:

```text id="z4s3ig"
20 30 40 50 50
```

Place the stored element at the end:

```text id="jh06n8"
20 30 40 50 10
```

## Complexity

- Time Complexity: `O(n)`
- Space Complexity: `O(1)`

## Implementation

[RotateArray.java](RotateArray.java)