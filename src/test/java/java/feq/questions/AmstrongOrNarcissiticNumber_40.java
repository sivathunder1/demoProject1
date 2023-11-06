package java.feq.questions;

public class AmstrongOrNarcissiticNumber_40 {
	public static void main(String[] args) {
		int number = 153; // Change this to the number you want to check
		if (isArmstrong(number)) {
			System.out.println(number + " is an Armstrong number.");
		} else {
			System.out.println(number + " is not an Armstrong number.");
		}
	}
	public static boolean isArmstrong(int number) {
		int originalNumber = number;
		int numberOfDigits = (int) Math.log10(number) + 1;
		int sum = 0;
		while (number > 0) {
			int digit = number % 10;
			sum += Math.pow(digit, numberOfDigits);
			number /= 10;
		}
		return sum == originalNumber;
	}
}