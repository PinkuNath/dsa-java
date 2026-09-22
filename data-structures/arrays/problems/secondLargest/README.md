# Second-Largest Element

## Problem

Given an array of integers, find the second-largest element in the array.

The second-largest element must be **different from the largest element**.

### Example

```text
Input:
10 25 7 40 15

Output:
25
```

## Approach

We can find the second-largest element in a single traversal of the array by maintaining two variables:

* `largest` — stores the largest element found so far.
* `secondLargest` — stores the second-largest element found so far.

### Steps

1. Initialize `largest` with the first element of the array.
2. Initialize `secondLargest` with `Integer.MIN_VALUE`.
3. Traverse the remaining elements.
4. If the current element is greater than `largest`:

    * The current `largest` becomes `secondLargest`.
    * The current element becomes `largest`.
5. Otherwise, if the current element is greater than `secondLargest` and different from `largest`, update `secondLargest`.
6. After the traversal, `secondLargest` contains the second-largest element.

### Example

Consider:

```text
10  25  7  40  15
```

Initially:

```text
largest = 10
secondLargest = Integer.MIN_VALUE
```

Compare `25`:

```text
25 > 10
```

Therefore:

```text
largest = 25
secondLargest = 10
```

Compare `7`:

```text
7 < 25
```

But:

```text
7 > 10
```

is false, so there is no change.

```text
largest = 25
secondLargest = 10
```

Compare `40`:

```text
40 > 25
```

Therefore:

```text
largest = 40
secondLargest = 25
```

Compare `15`:

```text
15 < 40
15 < 25
```

So there is no change.

Final result:

```text
largest = 40
secondLargest = 25
```

Therefore:

```text
Second-Largest Element = 25
```

## Complexity

* Time Complexity: `O(n)`
* Space Complexity: `O(1)`

## Implementation

[SecondLargest.java](SecondLargest.java)
