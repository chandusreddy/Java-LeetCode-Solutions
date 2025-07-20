package com.chandu.leetcode.arrays;

/*33. Search in Rotated Sorted Array

There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown 
pivot index k (1 <= k < nums.length) such that the resulting
array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). 
For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
Given the array nums after the possible rotation and an integer target, 
return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:
Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:
Input: nums = [1], target = 0
Output: -1
********************************
**   Time Complexity: O(logn) **
**  Space Complexity: O(1)    **
********************************
*/
public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 5, 6 };
		System.out.println(findPivot(array));
	}

	static int search(int[] nums, int target) {
		int pivot = findPivot(nums);
		if (pivot == -1) {
			return binarySearch(nums, target, 0, nums.length - 1);
		}
		if (nums[pivot] == target) {
			return pivot;
		}
		if (target >= nums[0]) {
			return binarySearch(nums, target, 0, pivot - 1);
		}

		return binarySearch(nums, target, pivot + 1, nums.length - 1);

	}

	// this will not work in duplicate values
	static int findPivot(int[] array) {
		int start = 0;
		int end = array.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (mid < end && array[mid] > array[mid + 1]) {
				end = mid;
			}

			if (mid > start && array[mid] < array[mid + 1]) {
				start = mid + 1;
			}

			if (array[mid] <= array[start]) {
				end = mid - 1;

			} else {
				start = mid + 1;
			}

		}

		return -1;

	}

	static int findPivotforDuplicateValues(int[] array) {
		int start = 0;
		int end = array.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (mid < end && array[mid] > array[mid + 1]) {
				return mid;
			}
			if (mid > start && array[mid] < array[mid - 1]) {
				return mid - 1;
			}
			// if elements at middle, start, end are equal then just skip the duplicates
			if (array[mid] == array[start] && array[mid] == array[end]) {
				// skip the duplicates
				// NOTE: what if these elements at start and end were the pivot??
				// check if start is pivot
				if (start < end && array[start] > array[start + 1]) {
					return start;
				}
				start++;

				// check whether end is pivot
				if (end > start && array[end] < array[end - 1]) {
					return end - 1;
				}
				end--;
			}
			// left side is sorted, so pivot should be in right
			else if (array[start] < array[mid] || (array[start] == array[mid] && array[mid] > array[end])) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}

	static int binarySearch(int[] arr, int target, int start, int end) {
		while (start <= end) {
			// find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
			int mid = start + (end - start) / 2;

			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				// ans found
				return mid;
			}
		}
		return -1;
	}

	// this will not work in duplicate
}
