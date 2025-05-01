package com.chandu.leetcode.arrays;

/*Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

 LeetCode : 977 https://leetcode.com/problems/squares-of-a-sorted-array/
 

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
*/
public class SquaresOfaSortedArray {

	// Using the Arrays in built sorting function with a Time Complexity of
	// O(nlongn).
//	public int[] sortedSquares(int[] nums) {
//        for(int i =0; i < nums.length; i++){
//            nums[i] = nums[i] * nums[i];
//        }
//        Arrays.sort(nums);
//        return nums;
//    }

	public static int[] sortedSquares(int[] nums) {
		int[] sortedarray = new int[nums.length];
		int smallindex = 0;
		int largeindex = nums.length - 1;
		for (int i = nums.length - 1; i >= 0; i--) {
			int smallindexval = nums[smallindex];
			int largeindexval = nums[largeindex];
			if (Math.abs(smallindexval) > Math.abs(largeindexval)) {
				sortedarray[i] = smallindexval * smallindexval;
				smallindex++;
			} else {
				sortedarray[i] = largeindexval * largeindexval;
				largeindex--;
			}

		}
		return sortedarray;

	}

	public static void main(String[] args) {

		int[] nums = { -7, -3, 2, 3, 11 };
		int n = nums.length;
		System.out.println("Before sort ");
		for (int i = 0; i < n; i++) {
			System.out.print(nums[i] + " ");
		}

		int[] sortednums = sortedSquares(nums);
		System.out.println();
		System.out.println("After Sorting : Squared values of the array are:");
		for (int i = 0; i < n; i++) {
			System.out.print(sortednums[i] + " ");
		}

	}
}
