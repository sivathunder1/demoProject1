package java.feq.questions;

public class MissingNumberInAnArray_21 { 
	public static int findMissingNumber(int[] nums) {
		int n = nums.length + 1; // Including the missing number
		int expectedSum = (n * (n + 1)) / 2;

		int actualSum = 0;
		for (int num : nums) {
			actualSum += num;
		}
		return expectedSum - actualSum;
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 5}; // Missing number is 4
		int missingNumber = findMissingNumber(arr);
		System.out.println("The missing number is: " + missingNumber);
	}
}

