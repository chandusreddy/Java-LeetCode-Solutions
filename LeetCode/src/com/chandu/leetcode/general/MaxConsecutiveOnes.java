/**
 * 
 */
package com.chandu.leetcode.general;

/**
 * @author Chandu 
 * LeetCode:
 *         https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3238/
 * 
 *         Given a binary array nums, return the maximum number of consecutive
 *         1's in the array.
 * 
 * 
 * 
 *         Example 1:
 * 
 *         Input: nums = [1,1,0,1,1,1] Output: 3 Explanation: The first two
 *         digits or the last three digits are consecutive 1s. The maximum
 *         number of consecutive 1s is 3. Example 2:
 * 
 *         Input: nums = [1,0,1,1,0,1] Output: 2
 * 
 * 
 *         Constraints:
 * 
 *         1 <= nums.length <= 105 nums[i] is either 0 or 1.
 *
 */
public class MaxConsecutiveOnes {

	public int findMaxConsectiveOnes(int[] nums) {

		int count = 0;
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				count = 0;
			} else {
				count++;
				result = Math.max(result, count);
			}

		}
		return result;

	}

	public static void main(String[] args) {

		int[] nums = { 1, 0, 1, 1, 0, 1, 1, 1, 1 };
		MaxConsecutiveOnes mo = new MaxConsecutiveOnes();
		int maxcount = mo.findMaxConsectiveOnes(nums);
		System.out.println("Finding the number of findMaxConsectiveOnes in the given array:  " + maxcount);

	}

}
