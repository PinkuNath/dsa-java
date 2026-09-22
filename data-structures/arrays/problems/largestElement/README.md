# Largest Element

## Problem

Given an array of integers, find the largest element in the array.

### Example

```text
Input:
10 25 7 40 15

Output:
40
```

## Approach

To find the largest element, we can traverse the array once while keeping track of the largest element found so far.

1. Assume the first element is the largest element.
2. Start traversing the array from the second element.
3. Compare each element with the current largest element.
4. If the current element is greater, update the largest element.
5. Continue until all elements have been checked.
6. The final value stored as `largest` is the largest element in the array.

### Example

Consider:

```text
10  25  7  40  15
↑
largest
```

Initially:

```text
largest = 10
```

Compare `25` with `10`:

```text
25 > 10
```

So:

```text
largest = 25
```

Compare `7` with `25`:

```text
7 < 25
```

No change:

```text
largest = 25
```

Compare `40` with `25`:

```text
40 > 25
```

So:

```text
largest = 40
```

Compare `15` with `40`:

```text
15 < 40
```

No change.

Therefore:

```text
Largest Element = 40
```

## Complexity

* Time Complexity: `O(n)`
* Space Complexity: `O(1)`

## Implementation

[LargestElement.java](LargestElement.java)
