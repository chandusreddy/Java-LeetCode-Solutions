/*
 * 1550. Three Consecutive Odds

Given an integer array arr, return true if there are three consecutive 
odd numbers in the array. Otherwise, return false.

Example 1:

Input: arr = [2,6,4,1]
Output: false
Explanation: There are no three consecutive odds.

Example 2:

Input: arr = [1,2,34,3,4,5,7,23,12]
Output: true
Explanation: [5,7,23] are three consecutive odds.
********************************
** Time Complexity: O(n)      **
** Space Complexity: O(1)     **
******************************** 
 * **/

package com.chandu.leetcode.arrays;

public class ThreeConsectiveOdds {

	public boolean threeConsecutiveOdds(int[] arr) {

		int oddcount = 0;
		for (int value : arr) {
			if (value % 2 == 1) {
				oddcount++;

				if (oddcount == 3)
					return true;
			} else {
				oddcount = 0;
			}

		}

		return false;

	}
}
