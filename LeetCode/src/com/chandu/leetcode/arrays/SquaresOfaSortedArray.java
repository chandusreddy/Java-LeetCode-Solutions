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

	public static void sortedSquares(int[] nums) {
		int n = nums.length;
		int k;
		for (k = 0; k < n; k++) {
			if (nums[k] >= 0)
				break;

			int i = k - 1; // Initial index of first half
			int j = k; // Initial index of second half
			int ind = 0; // Initial index of temp numsay

			int[] temp = new int[n];
			while (i >= 0 && j < n) {
				if (nums[i] * nums[i] < nums[j] * nums[j]) {
					temp[ind] = nums[i] * nums[i];
					i--;
				} else {

					temp[ind] = nums[j] * nums[j];
					j++;
				}
				ind++;
			}

			while (i >= 0) {
				temp[ind++] = nums[i] * nums[i];
				i--;
			}
			while (j < n) {
				temp[ind++] = nums[j] * nums[j];
				j++;
			}

			// copy 'temp' numsay into original numsay
			for (int x = 0; x < n; x++)
				nums[x] = temp[x];
		}

	}

	public static void main(String[] args) {

		int[] nums = { -7, -3, 2, 3, 11 };
		int n = nums.length;
		System.out.println("Before sort ");
		for (int i = 0; i < n; i++) {
			System.out.print(nums[i] + " ");
		}

		sortedSquares(nums);
		System.out.println();
		System.out.println("After Sorting : Squared values of the array are:");
		for (int i = 0; i < n; i++) {
			System.out.print(nums[i] + " ");
		}

	}
}
