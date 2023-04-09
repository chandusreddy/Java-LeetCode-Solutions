/**
 * 
 */
package com.chandu.leetcode.general;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chandu
 * 
 * 			1295. Find Numbers with Even Number of Digits
 *         LeetCode:
 *         https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
 * 
 *         Given an array nums of integers, return how many of them contain an
 *         even number of digits.
 * 
 * 
 * 
 *         Example 1:
 * 
 *         Input: nums = [12,345,2,6,7896] Output: 2 Explanation: 12 contains 2
 *         digits (even number of digits). 345 contains 3 digits (odd number of
 *         digits). 2 contains 1 digit (odd number of digits). 6 contains 1
 *         digit (odd number of digits). 7896 contains 4 digits (even number of
 *         digits). Therefore only 12 and 7896 contain an even number of digits.
 *         Example 2:
 * 
 *         Input: nums = [555,901,482,1771] Output: 1 Explanation: Only 1771
 *         contains an even number of digits.
 *
 */
public class FindEvenNumberOfDigits {

	public int findNumbers(int[] nums) {

		List<String> list = new ArrayList<>();
		for (int num : nums) {
			if (String.valueOf(num).length() % 2 == 0) {
				list.add(String.valueOf(num));
			}

		}
		return list.size();
	}

	public static void main(String[] args) {
		FindEvenNumberOfDigits fen = new FindEvenNumberOfDigits();
		int[] nums = { 555, 901, 482, 1771 };
		int numberofevendigits = fen.findNumbers(nums);
		System.out.println("The number of Even digits numbers in the given array: " + numberofevendigits );
	}
}
