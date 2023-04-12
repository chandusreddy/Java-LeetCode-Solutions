/**
 * 
 */
package com.chandu.leetcode.datastructure1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Chandu
 * 
 *         LeetCode: 1 Two Sum
 * 
 *         https://leetcode.com/problems/two-sum/?envType=study-plan&id=data-structure-i
 * 
 * 
 *         Given an array of integers nums and an integer target, return indices
 *         of the two numbers such that they add up to target.
 * 
 *         You may assume that each input would have exactly one solution, and
 *         you may not use the same element twice.
 * 
 *         You can return the answer in any order.
 * 
 * 
 * 
 *         Example 1:
 * 
 *         Input: nums = [2,7,11,15], target = 9 Output: [0,1] Explanation:
 *         Because nums[0] + nums[1] == 9, we return [0, 1]. Example 2:
 * 
 *         Input: nums = [3,2,4], target = 6 Output: [1,2] Example 3:
 * 
 *         Input: nums = [3,3], target = 6 Output: [0,1]
 * 
 * 
 *         Constraints:
 * 
 *         2 <= nums.length <= 104 -109 <= nums[i] <= 109 -109 <= target <= 109
 */
public class TwoSum {

	public int[] twoSumGenerator(int[] nums, int target) {

		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				result[1] = i;
				result[0] = map.get(target - nums[i]);
				return result;
			}
			map.put(nums[i], i);

		}

		return result;

	}

	public static void main(String[] args) {
		TwoSum ts = new TwoSum();
		int[] nums = { 2, 7, 11, 15 };
		int[] endresult = ts.twoSumGenerator(nums, 9);
		System.out.println("Given array indexs of the Two Sums value is: " +endresult[0]+  "and " + endresult[1]);
	}

}
