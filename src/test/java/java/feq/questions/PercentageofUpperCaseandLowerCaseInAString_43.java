package java.feq.questions;

public class PercentageofUpperCaseandLowerCaseInAString_43 {
	public static void main(String[] args) {
		String inputString = "Hello World! 123";
		double totalChars = inputString.length();
		double uppercaseCount = 0;
		double lowercaseCount = 0;
		double digitCount = 0;
		double specialCharCount = 0;
		for (int i = 0; i < inputString.length(); i++) {
			char ch = inputString.charAt(i);
			if (Character.isUpperCase(ch)) {
				uppercaseCount++;
			} else if (Character.isLowerCase(ch)) {
				lowercaseCount++;
			} else if (Character.isDigit(ch)) {
				digitCount++;
			} else {
				specialCharCount++;
			}
		}
		double uppercasePercentage = (uppercaseCount / totalChars) * 100;
		double lowercasePercentage = (lowercaseCount / totalChars) * 100;
		double digitPercentage = (digitCount / totalChars) * 100;
		double specialCharPercentage = (specialCharCount / totalChars) * 100;
		System.out.println("Uppercase Letters Percentage: " + uppercasePercentage + "%");
		System.out.println("Lowercase Letters Percentage: " + lowercasePercentage + "%");
		System.out.println("Digits Percentage: " + digitPercentage + "%");
		System.out.println("Special Characters Percentage: " + specialCharPercentage +
				"%");
	}
}