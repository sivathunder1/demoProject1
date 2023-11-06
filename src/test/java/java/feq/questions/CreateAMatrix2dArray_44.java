package java.feq.questions;

public class CreateAMatrix2dArray_44 {
	public static void main(String[] args) {
		// Create a 3x3 matrix
		int[][] matrix = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		// Iterate through the matrix using nested loops
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				int element = matrix[row][col];
				System.out.print(element + " ");
			}
			System.out.println(); // Move to the next row
		}
	}
}