package java.feq.questions;

public class MaximumAndMinNumber_48 {
	public class MaximumAndMinNumber {
		public static void main(String[] args) {
			int num1 = 10;
			int num2 = 20;
			int num3 = 15;
			int max = findMax(num1, num2, num3);
			int min = findMin(num1, num2, num3);
			System.out.println("Maximum Number: " + max);
			System.out.println("Minimum Number: " + min);
		}
		public static int findMax(int a, int b, int c) {
			// Use the Math.max method to find the maximum of three numbers
			return Math.max(Math.max(a, b), c);
		}
		public static int findMin(int a, int b, int c) {
			// Use the Math.min method to find the minimum of three numbers
			return Math.min(Math.min(a, b), c);
		}
	}
}