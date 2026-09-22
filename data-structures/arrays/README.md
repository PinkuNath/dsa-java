# Arrays

## Definition

An array is a linear data structure that stores elements of the same data type in contiguous memory locations.

Elements are accessed using an index. In Java, array indexing starts from `0`.

---

## Memory Representation

Example:

```text
Index :  0   1   2   3   4
Value : 10  20  30  40  50
```

For an array, the address of an element can be represented as:

```text
Address(arr[i]) = Base Address + (i × Size of Data Type)
```

---

## Properties

* Linear data structure
* Fixed size
* Homogeneous elements
* Contiguous memory allocation
* Index-based access
* Zero-based indexing in Java

---

## Operations

### Traversal

Visit every element of the array.

Implementation:

* [ArrayTraversal.java](implementations/ArrayTraversal.java)

Time Complexity: `O(n)`

### Insertion

Insert an element at a specific position by shifting elements to the right.

Implementation:

* [ArrayInsertion.java](implementations/ArrayInsertion.java)

Time Complexity: `O(n)`

### Deletion

Delete an element from a specific position by shifting remaining elements to the left.

Implementation:

* [ArrayDeletion.java](implementations/ArrayDeletion.java)

Time Complexity: `O(n)`

### Linear Search

Search for an element by checking elements one by one.

Implementation:

* [LinearSearch.java](implementations/LinearSearch.java)

Time Complexity:

* Best Case: `O(1)`
* Average Case: `O(n)`
* Worst Case: `O(n)`

### Binary Search

Search for an element in a sorted array by repeatedly dividing the search range.

Implementation:

* [BinarySearch.java](implementations/BinarySearch.java)

Time Complexity:

* Best Case: `O(1)`
* Average Case: `O(log n)`
* Worst Case: `O(log n)`

---

## Complexity Analysis

| Operation     | Time Complexity |
|---------------|-----------------|
| Access        | O(1)            |
| Traversal     | O(n)            |
| Insertion     | O(n)            |
| Deletion      | O(n)            |
| Linear Search | O(n)            |
| Binary Search | O(log n)        |

---

## Advantages

* Constant-time random access
* Simple to use
* Cache-friendly memory access
* Foundation for many other data structures

---

## Limitations

* Fixed size
* Insertion and deletion can be expensive
* Requires contiguous memory
* May result in unused space

---

## Practice Problems

* [Reverse Array](problems/reverseArray/README.md)
* [Largest Element](problems/largestElement/README.md)
* [Second-Largest Element](problems/secondLargest/README.md)
* [Move Zeroes](problems/moveZeroes/README.md)
* [Rotate Array](problems/rotateArray/README.md)
* [Remove Duplicates](problems/removeDuplicates/README.md)
* [Merge Sorted Arrays](problems/mergeSortedArrays/README.md)
* [Maximum Subarray Sum](problems/maximumSubarraySum/README.md)