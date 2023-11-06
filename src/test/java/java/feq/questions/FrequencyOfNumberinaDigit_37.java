package java.feq.questions;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfNumberinaDigit_37 {
	public static void main(String[] args) {
		long number = 12345612345L; // Change this to your number
		Map<Integer, Integer> digitFrequency = new HashMap<>();
		// Convert the number to a string to iterate through its digits
		String numberStr = String.valueOf(number);
		// Iterate through each digit and count their frequency
		for (int i = 0; i < numberStr.length(); i++) {
			char digitChar = numberStr.charAt(i);
			if (Character.isDigit(digitChar)) {
				int digit = Character.getNumericValue(digitChar);
				digitFrequency.put(digit, digitFrequency.getOrDefault(digit, 0) + 1);
			}
		}
		// Display the frequency of each digit
		for (Map.Entry<Integer, Integer> entry : digitFrequency.entrySet()) {
			System.out.println("Digit " + entry.getKey() + " occurs " + entry.getValue() +
					" times.");
		}
	}
}