package com.chandu.leetcode.arrays;
/*
 *Given an m x n matrix, return all elements of the matrix in spiral order. 
 * Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
*********************************
** Time Complexity: O(M∗N)    **
** Space Complexity: O(M∗N)   **
********************************
Constraints:

    m == matrix.length
    n == matrix[i].length
    1 <= m, n <= 10
    -100 <= matrix[i][j] <= 100

 * */
import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	public List<Integer> spiralOrder(int[][] matrix) {
		if (matrix.length == 0)
			return new ArrayList<Integer>();
		List<Integer> SpiralMatrix = new ArrayList<Integer>();

		int startRow = 0;
		int endRow = matrix.length - 1;
		int startCol = 0;
		int endCol = matrix[0].length - 1;
		while (startRow <= endRow && startCol <= endCol) {
			for (int col = startCol; col <= endCol; col++) {
				SpiralMatrix.add(matrix[startRow][col]);
			}
			startRow++;
			for (int row = startRow; row <= endRow; row++) {
				SpiralMatrix.add(matrix[row][endCol]);
			}
			endCol--;
			if (startRow <= endRow) {
				for (int col = endCol; col >= startCol; col--) {
					SpiralMatrix.add(matrix[endRow][col]);
				}
			}
			endRow--;
			if (startCol <= endCol) {
				for (int row = endRow; row >= startRow; row--) {
					SpiralMatrix.add(matrix[row][startCol]);
				}
			}
			startCol++;

		}

		return SpiralMatrix;

	}

}
