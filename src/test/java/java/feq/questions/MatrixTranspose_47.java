package java.feq.questions;

public class MatrixTranspose_47 {
	public static void main(String[] args) {
		int[][] matrix = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		int[][] transpose = transposeMatrix(matrix);
		System.out.println("Original Matrix:");
		printMatrix(matrix);
		System.out.println("Transposed Matrix:");
		printMatrix(transpose);
	}
	public static int[][] transposeMatrix(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		int[][] transpose = new int[cols][rows];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				transpose[j][i] = matrix[i][j];
			}
		}
		return transpose;
	}
	public static void printMatrix(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}