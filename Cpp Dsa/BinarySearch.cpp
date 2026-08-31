/**
 * Problem Statement: Binary Search
 * Given a sorted array of integers and a target key, search for the key.
 * Return the index if found; otherwise, return -1.
 *
 * Time Complexity: O(log N) - Search space is halved in each step.
 * Space Complexity: O(1) - Constant extra space.
 */

#include <iostream>
#include <vector>

using namespace std;

int binarySearch(const vector<int>& arr, int key) {
    int start = 0;
    int end = arr.size() - 1;

    while (start <= end) {
        // Prevents potential integer overflow compared to (start + end) / 2
        int mid = start + (end - start) / 2;

        if (arr[mid] == key) {
            return mid; // Key found
        } else if (arr[mid] < key) {
            start = mid + 1; // Search right half
        } else {
            end = mid - 1; // Search left half
        }
    }

    return -1; // Key not found
}

int main() {
    vector<int> arr = {46, 51, 67, 82, 93, 99, 117, 128};
    int key = 67;

    int pos = binarySearch(arr, key);

    if (pos != -1) {
        cout << "Element found at index: " << pos << endl;
    } else {
        cout << "Element not found" << endl;
    }

    return 0;
}