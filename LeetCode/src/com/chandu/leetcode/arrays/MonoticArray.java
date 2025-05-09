/*896. Monotonic Array
An array is monotonic if it is either monotone increasing or monotone decreasing.
An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j].
An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].
Given an integer array nums, return true if the given array is monotonic,
 or false otherwise.

Example 1:
Input: nums = [1,2,2,3]
Output: true
Example 2:
Input: nums = [6,5,4,4]
Output: true
Example 3:
Input: nums = [1,3,2]
Output: false

********************************
**      Solution 1            **
**   Time Complexity: O(n)    **
**  Space Complexity: O(1)    **
********************************

********************************
**      Solution 2            **
**   Time Complexity: O(n)    **
**  Space Complexity: O(1)    **
********************************
*
 * **/
package com.chandu.leetcode.arrays;

public class MonoticArray {
	public static boolean isMonotonic(int[] array) {
		// Solution 1 - O(n) time | O(1) space where n is the length of the array.
		boolean isNonDecreasing = true;
		boolean isNonIncreasing = true;
		for (int i = 1; i < array.length; i++) {
			if (array[i] < array[i - 1]) {
				isNonDecreasing = false;
			}
			if (array[i] > array[i - 1]) {
				isNonIncreasing = false;
			}
		}
		return isNonDecreasing || isNonIncreasing;
	}
	/**
	 * //Solution 2 - O(n) time | O(1) space where n is the length of the array.
	 * public boolean isMonotonic(int[] nums) { if (nums.length < 2) return true;
	 * 
	 * int direction = 0; // 0 means unknown, 1 means increasing, -1 means
	 * decreasing
	 * 
	 * for (int i = 1; i < nums.length; i++) { if (nums[i] > nums[i-1]) { //
	 * increasing if (direction == 0) direction = 1; else if (direction == -1)
	 * return false; } else if (nums[i] < nums[i-1]) { // decreasing if (direction
	 * == 0) direction = -1; else if (direction == 1) return false; } }
	 * 
	 * return true;
	 ***/

}
