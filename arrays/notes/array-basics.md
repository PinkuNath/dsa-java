# Arrays

## Definition

An array is a linear data structure that stores elements of the same data type in contiguous memory locations.

Arrays provide direct access to elements using their index and are one of the most fundamental data structures in computer science.

---

## Memory Representation

Example:

```text
Index :  0   1   2   3   4
Value : 10  20  30  40  50
```

Access Formula:

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

Visiting every element exactly once.

Implementation:

*  [ArrayTraversal.java](../implementations/ArrayTraversal.java)

Time Complexity: O(n)

### Insertion

Insert an element at a specific position by shifting elements to the right.

Implementation:

* ArrayInsertion.java *(To Be Added)*

Time Complexity: O(n)

### Deletion

Delete an element by shifting remaining elements to the left.

Implementation:

* ArrayDeletion.java *(To Be Added)*

Time Complexity: O(n)

### Linear Search

Search elements one by one until the target element is found.

Implementation:

* LinearSearch.java *(To Be Added)*

Time Complexity:

* Best Case: O(1)
* Average Case: O(n)
* Worst Case: O(n)

### Binary Search

Search a sorted array by repeatedly dividing the search space.

Implementation:

* BinarySearch.java *(To Be Added)*

Time Complexity:

* Best Case: O(1)
* Average Case: O(log n)
* Worst Case: O(log n)

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
* Simple implementation
* Cache-friendly memory access
* Foundation for many advanced data structures

---

## Limitations

* Fixed size
* Expensive insertion and deletion
* Requires contiguous memory allocation
* Possible memory wastage

---

## Implementations

- [ArrayTraversal.java](../implementations/ArrayTraversal.java)

---

## Practice Problems

Problems will be added as they are solved.

* Reverse Array
* Largest Element
* Second-Largest Element
* Move Zeroes
* Rotate Array
* Remove Duplicates
* Merge Sorted Arrays
* Maximum Subarray Sum
