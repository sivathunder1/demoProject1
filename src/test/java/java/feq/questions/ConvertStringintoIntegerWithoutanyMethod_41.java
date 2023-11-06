package java.feq.questions;

public class ConvertStringintoIntegerWithoutanyMethod_41 {
	public static void main(String[] args) {
		String str = "12345";
		int number = stringToNumber(str);
		System.out.println("Converted Number: " + number);
	}
	public static int stringToNumber(String str) {
		int result = 0;
		boolean isNegative = false;
		int startIndex = 0;
		if (str.charAt(0) == '-') {
			isNegative = true;
			startIndex = 1;
		}
		for (int i = startIndex; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c < '0' || c > '9') {
				throw new NumberFormatException("Invalid character in the string: " + c);
			}
			int digit = c - '0';
			result = result * 10 + digit;
		}
		return isNegative ? -result : result;
	}
}