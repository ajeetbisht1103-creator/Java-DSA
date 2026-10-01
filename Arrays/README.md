# Arrays

This directory contains solutions to fundamental and intermediate array problems, implemented with optimal time and space complexities.

---

## 📌 Problem List & Progress

| # | Problem | Difficulty | Solution File | Approach / Complexity |
|---|---|---|---|---|
| 01 | [Largest Element in an Array](#) | Easy | `LargestElement.java` | Single Pass: $O(N)$ Time, $O(1)$ Space |
| 02 | [Second Smallest & Second Largest](#) | Easy | `SecondLargestAndSmallest.java` | Single Pass: $O(N)$ Time, $O(1)$ Space |
| 03 | [Check if Array is Sorted](#) | Easy | `CheckIfArrayIsSorted.java` | Single Pass: $O(N)$ Time, $O(1)$ Space |
| 04 | [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) | Easy | `RemoveDuplicates.java` | Two Pointers: $O(N)$ Time, $O(1)$ Space |
| 05 | [Left Rotate Array by One Place](#) | Easy | `LeftRotateArrayByOne.java` | In-place Shift: $O(N)$ Time, $O(1)$ Space |
| 06 | [Rotate Array by K Places](https://leetcode.com/problems/rotate-array/) | Medium | `RotateArrayByKPlaces.java` | Reversal Algorithm: $O(N)$ Time, $O(1)$ Space |
| 07 | [Check if Array is Sorted and Rotated](https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/) | Easy | `CheckIfArrayIsSortedAndRotated.java` | Break Counting: $O(N)$ Time, $O(1)$ Space |
| 08 | [Move Zeroes to End](https://leetcode.com/problems/move-zeroes/) | Easy | `MoveZeroes.java` | Two Pointers: $O(N)$ Time, $O(1)$ Space |
| 09 | [Linear Search](#) | Easy | `LinearSearch.java` | Traversal: $O(N)$ Time, $O(1)$ Space |
| 10 | [Binary Search](https://leetcode.com/problems/binary-search/) | Easy | `BinarySearch.cpp` | Divide & Conquer: $O(\log N)$ Time, $O(1)$ Space |
| 11 | [Union of Two Sorted Arrays](#) | Easy | `UnionOfSortedArrays.java` | Two Pointers: $O(N + M)$ Time, $O(N + M)$ Space |
| 12 | [Intersection of Two Sorted Arrays](https://leetcode.com/problems/intersection-of-two-arrays-ii/) | Easy | `ArrayIntersection.java` | Two Pointers: $O(N + M)$ Time, $O(\min(N, M))$ Space |
| 13 | [Missing Number](https://leetcode.com/problems/missing-number/) | Easy | `MissingNumber.java` | Sum Formula / XOR: $O(N)$ Time, $O(1)$ Space |
| 14 | [Max Consecutive Ones](https://leetcode.com/problems/max-consecutive-ones/) | Easy | `MaxConsecutiveOnes.java` | Counting Tracker: $O(N)$ Time, $O(1)$ Space |
| 15 | [Single Number](https://leetcode.com/problems/single-number/) | Easy | `SingleNumber.java` | Bitwise XOR: $O(N)$ Time, $O(1)$ Space |

---

## 💡 Key Patterns & Concepts Covered

- **Two Pointers:** Efficient array modifications in-place (`Remove Duplicates`, `Move Zeroes`, `Union/Intersection`).
- **Reversal Algorithm:** $O(1)$ space rotations for shifting elements left/right by $K$ positions.
- **Bit Manipulation:** Using XOR properties ($A \oplus A = 0$, $0 \oplus A = A$) for linear time, constant space solutions.
- **Cycle / Shift Invariants:** Counting transitions across boundary conditions using modulo arithmetic (`(i + 1) % n`).

---

## 🛠️ Languages & Tools

- **Languages:** Java, C++
- **IDE / Environment:** VS Code