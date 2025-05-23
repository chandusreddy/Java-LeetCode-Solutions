/*
 * 1295. Find Numbers with Even Number of Digits
Given an array nums of integers, return how many of 
them contain an even number of digits.
Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.

Example 2:

Input: nums = [555,901,482,1771]
Output: 1 
Explanation: 
Only 1771 contains an even number of digits.
********************************
**   Time Complexity: O(n)    **
**  Space Complexity: O(1)    **
********************************
*/
package com.chandu.leetcode.arrays;

public class EvenDigits {
	public int findNumbers(int[] nums) {
		int count = 0;
		for (int num : nums) {
			if (even(num)) {
				count++;
			}

		}

		return count;
	}

	private boolean even(int num) {
		int numberofDigits = digits(num);
		return numberofDigits % 2 == 0;
	}

	private int digits(int num) {
		if (num < 0) {
			num = num * -1;
		}

		return (int) (Math.log10(num)) + 1;
	}

}
