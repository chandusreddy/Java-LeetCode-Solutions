/**
 * 
 */
package com.chandu.leetcode.datastructure1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Chandu LeetCode # 217 - Contains Duplicate
 *         https://leetcode.com/problems/contains-duplicate/?envType=study-plan&id=data-structure-i
 * 
 *         Given an integer array nums, return true if any value appears at
 *         least twice in the array, and return false if every element is
 *         distinct.
 * 
 *         Example 1:
 * 
 *         Input: nums = [1,2,3,1] Output: true Example 2:
 * 
 *         Input: nums = [1,2,3,4] Output: false Example 3:
 * 
 *         Input: nums = [1,1,1,3,3,4,3,2,4,2] Output: true
 * 
 * 
 *         Constraints:
 * 
 *         1 <= nums.length <= 105 -109 <= nums[i] <= 109
 * 
 *
 */
public class ContainsDuplicate {

	// Approach 1 - Linear Search
	public boolean Duplicates(int[] nums) {
		boolean duplicate = false;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < i; j++) {
				if (nums[j] == nums[i]) {
					duplicate = true;
				}
			}

		}

		return duplicate;
	}

	// Approach 2 - Sorting
	public boolean SortingDuplicates(int[] nums) {
		boolean duplicate = false;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				duplicate = true;
			}
		}

		return duplicate;
	}

	// Approach 3 - Hashset
	public boolean HashSetDuplicates(int[] nums) {
		boolean duplicate = false;
		Set<Integer> set = new HashSet<>(nums.length);
		for (int num : nums) {
			if (set.contains(num)) {
				duplicate = true;
			}
			else {
				set.add(num);
			}
		}

		return duplicate;
	}

	public static void main(String[] args) {
		ContainsDuplicate cd = new ContainsDuplicate();
		
		int[] nums = { 1, 2, 3, 1 };
		boolean result = cd.Duplicates(nums);
		System.out.println("Finding the duplicates in an array using: Linear Search Approach: " + result);
		
		int[] nums1 = { 1, 2, 3, 4 };
		boolean result1 = cd.SortingDuplicates(nums1);
		System.out.println("Finding the duplicates in an array using: Sorting Approach: " + result1);
		
		
		int[] nums2 = { 1, 2, 3, 1 };
		boolean result2 = cd.HashSetDuplicates(nums2);
		System.out.println("Finding the duplicates in an array using: HashSet  Approach: " + result2);

	}

}
