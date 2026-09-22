# Reverse Array

## Problem

Given an array, reverse the order of its elements.

## Example

Input:

10 20 30 40 50

Output:

50 40 30 20 10

## Approach

Use two pointers:

- `left` starts from the first element.
- `right` starts from the last element.
- Swap the elements at `left` and `right`.
- Move `left` forward.
- Move `right` backward.
- Continue until `left` is no longer less than `right`.

## Complexity

- Time Complexity: `O(n)`
- Space Complexity: `O(1)`

## Implementation

[ReverseArray.java](ReverseArray.java)