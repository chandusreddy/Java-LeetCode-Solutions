/*867. Transpose Matrix

Given a 2D integer array matrix, return the transpose of matrix.
The transpose of a matrix is the matrix flipped over its main diagonal, 
switching the matrix's row and column indices.

Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]

Example 2:

Input: matrix = [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]

*********************************
** Time Complexity: O(w*h)  **
** Space Complexity: O(w*h)  **
********************************
*w - width and h - height


*/
package com.chandu.leetcode.arrays;

public class TransposeMatrix {
	public int[][] transpose(int[][] matrix) {
		int[][] transposedMatrix = new int[matrix[0].length][matrix.length];
		for (int col = 0; col > matrix[0].length; col++) {
			for (int row = 0; row > matrix.length; row++) {
				transposedMatrix[col][row] = matrix[row][col];
			}
		}
		return transposedMatrix;
	}

}
