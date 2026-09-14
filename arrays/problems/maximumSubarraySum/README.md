# Maximum Subarray Sum

## Problem

Given an array of integers, find the maximum possible sum of a contiguous subarray.

### Example

```text id="76cwzc"
Input:
-2 1 -3 4 -1 2 1 -5 4

Output:
6
```

The maximum-sum subarray is:

```text id="4ny1b2"
4 -1 2 1
```

Sum:

```text id="24wc9x"
4 + (-1) + 2 + 1 = 6
```

## Approach

This problem can be solved efficiently using **Kadane's Algorithm**.

The idea is:

- Maintain the sum of the current subarray.
- If extending the current subarray becomes worse than starting a new subarray, start a new one.
- Track the maximum sum encountered during traversal.

### Steps

1. Initialize:
    - `currentSum = arr[0]`
    - `maxSum = arr[0]`
2. Traverse the array from index `1`.
3. For each element:
    - Either start a new subarray from the current element.
    - Or extend the existing subarray.
4. Update `maxSum` whenever a larger sum is found.
5. After traversal, `maxSum` contains the answer.

### Example

```text id="o4m1tw"
Array:

-2 1 -3 4 -1 2 1 -5 4
```

At:

```text id="4g5nsa"
4 -1 2 1
```

the running sum becomes:

```text id="0o4wvy"
4
3
5
6
```

The largest value obtained is:

```text id="1g8r55"
6
```

Therefore:

```text id="v20g44"
Maximum Subarray Sum = 6
```

## Complexity

- Time Complexity: `O(n)`
- Space Complexity: `O(1)`

## Implementation

[MaximumSubarraySum.java](MaximumSubarraySum.java)