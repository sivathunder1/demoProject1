package java.feq.questions;

public class MatrixAdditionAndSubtraction_45 {
	public static void main(String[] args) {
		int[][] matrix1 = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		int[][] matrix2 = {
				{9, 8, 7},
				{6, 5, 4},
				{3, 2, 1}
		};
		// Perform matrix addition and print the result
		int[][] additionResult = addMatrices(matrix1, matrix2);
		System.out.println("Matrix Addition Result:");
		printMatrix(additionResult);
		// Perform matrix subtraction and print the result
		int[][] subtractionResult = subtractMatrices(matrix1, matrix2);
		System.out.println("Matrix Subtraction Result:");
		printMatrix(subtractionResult);
	}
	public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
		int rows = matrix1.length;
		int cols = matrix1[0].length;
		int[][] result = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				result[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		return result;
	}
	public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
		int rows = matrix1.length;
		int cols = matrix1[0].length;
		int[][] result = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				result[i][j] = matrix1[i][j] - matrix2[i][j];
			}
		}
		return result;
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