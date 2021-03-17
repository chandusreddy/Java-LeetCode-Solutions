package com.chandu.leetcode.arrays;

/* Given an array nums of integers, return how many of them contain an even number of digits.


Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits. */

public class FindEvenNumberOfDigitsInAnArray {

	public static int findNumbers(int[] nums) {
		int count = 0;
		for (int num : nums) {
			if (findDigits(num) % 2 == 0) {
				count++;
			}
		}
		return count;

	}

	public static int findDigits(int num) {
		int count = 0;
		while (num != 0) {
			count++;
			num /= 10;
		}

		return count;

	}

	public static String arrayToString(int arr[]) {
		if (arr.length > 0) {
			String result = "";
			for (int i = 0; i < arr.length; i++) {
				result += arr[i] + " ";
			}
			return result;
		} else {
			return "Empty Array!";
		}
	}

	public static void main(String[] args) {

		int[] nums = { 12, 345, 2, 6, 7896 };
		System.out.println("The Given Array values: " + arrayToString(nums));

		int numbers = findNumbers(nums);

		System.out.println("The Number of Even Digits Values in an Array are: " + numbers);

	}
}