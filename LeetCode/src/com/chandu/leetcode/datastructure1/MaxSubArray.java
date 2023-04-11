/**
 * 
 */
package com.chandu.leetcode.datastructure1;

/**
 * @author Chandu
 *         https://leetcode.com/problems/maximum-subarray/?envType=study-plan&id=data-structure-i
 * 
 *         LeetCode: 53: Maximum Subarray Given an integer array nums, find the
 *         subarray with the largest sum, and return its sum.
 * 
 * 
 * 
 *         Example 1:
 * 
 *         Input: nums = [-2,1,-3,4,-1,2,1,-5,4] Output: 6 Explanation: The
 *         subarray [4,-1,2,1] has the largest sum 6. Example 2:
 * 
 *         Input: nums = [1] Output: 1 Explanation: The subarray [1] has the
 *         largest sum 1. Example 3:
 * 
 *         Input: nums = [5,4,-1,7,8] Output: 23 Explanation: The subarray
 *         [5,4,-1,7,8] has the largest sum 23.
 * 
 * 
 *         Constraints:
 * 
 *         1 <= nums.length <= 105 -104 <= nums[i] <= 104
 */
public class MaxSubArray {

	public int maxSubArray(int[] nums) {
		int currentMaxSum = nums[0];
		int MaxSum = nums[0];
		for(int i=1; i < nums.length; i ++) {
			currentMaxSum = Math.max(currentMaxSum + nums[i], nums[i]);
			MaxSum = Math.max(MaxSum, currentMaxSum);
		}
		
		
		
		return MaxSum;

	}

	public static void main(String[] args) {

		MaxSubArray msa = new MaxSubArray();
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int maxsum = msa.maxSubArray(nums);
		System.out.println("The Max Sum of the subarray from the given array is: " + maxsum);
	}

}
