package java.feq.questions;

public class BinaryNumberCheck_31 {
	public class BinaryNumberCheck {
		public static void main(String[] args) {
			String binaryNumber = "1010101";
			if (isBinaryUsingRegex(binaryNumber)) {
				System.out.println(binaryNumber + " is a valid binary number.");
			} else {
				System.out.println(binaryNumber + " is not a valid binary number.");
			}
		}
		public static boolean isBinaryUsingRegex(String str) {
			// Regular expression to match a binary number (only 0s and 1s)
			String regex = "^[01]+$";
			return str.matches(regex);
		}
	}
}