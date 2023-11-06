package java.feq.questions;

public class MatrixMultiplication_46 {
	public static void main(String[] args) {
		int[][] matrix1 = {
				{2, 3, 4},
				{5, 6, 7}
		};
		int[][] matrix2 = {
				{8, 9},
				{10, 11},
				{12, 13}
		};
		int[][] product = multiplyMatrices(matrix1, matrix2);
		System.out.println("Matrix 1:");
		printMatrix(matrix1);
		System.out.println("Matrix 2:");
		printMatrix(matrix2);
		System.out.println("Matrix Product:");
		printMatrix(product);
	}
	public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
		int rows1 = matrix1.length;
		int cols1 = matrix1[0].length;
		int cols2 = matrix2[0].length;
		int[][] product = new int[rows1][cols2];
		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < cols2; j++) {
				for (int k = 0; k < cols1; k++) {
					product[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}
		return product;
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