/**
 * 
 */
package com.chandu.leetcode.datastructure1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Chandu
 *
 *         Leet Code # 350
 *
 *         350. Intersection of Two Arrays II
 * 
 * 
 *         Given two integer arrays nums1 and nums2, return an array of their
 *         intersection. Each element in the result must appear as many times as
 *         it shows in both arrays and you may return the result in any order.
 * 
 * 
 * 
 *         Example 1:
 * 
 *         Input: nums1 = [1,2,2,1], nums2 = [2,2] Output: [2,2] Example 2:
 * 
 *         Input: nums1 = [4,9,5], nums2 = [4,99,,8,4] Output: [4,9]
 *         Explanation: [9,4] is also accepted.
 * 
 * 
 *         Constraints:
 * 
 *         1 <= nums1.length, nums2.length <= 1000 0 <= nums1[i], nums2[i] <=
 *         1000
 * 
 */
public class IntersectionArray {

	public int[] intersect(int[] nums1, int[] nums2) {

		HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums1.length; i++) {
			if (!data.containsKey(nums1[i])) {
				data.put(nums1[i], 1);
			} else {
				data.put(nums1[i], data.get(nums1[i]) + 1);
			}
		}
		List<Integer> res = new LinkedList<Integer>();

		for (int i = 0; i < nums2.length; i++) {
			if (data.containsKey(nums2[i]) && data.get(nums2[i]) != 0) {
				res.add(nums2[i]);
				data.put(nums2[i], data.get(nums2[i]) - 1);

			}
		}
		int[] result = new int[res.size()];
		int i = 0;
		for (Integer j : res) {
			result[i++] = j;
		}
		return result;

	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };
		IntersectionArray inarray = new IntersectionArray();
		int[] result = inarray.intersect(nums1, nums2);

		System.out.println("The Intersect Array of the given array are: " + result[0] + "," + result[1]);

	}

}
