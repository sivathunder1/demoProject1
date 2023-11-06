package java.feq.questions;

public class LengthOfStringInJavaWithoutUsingLengthMethod_22 {
	public static int getStringLength(String str) {
		int length = 0;
		// Iterate through the string until the end is reached
		for (char c : str.toCharArray()) {
			length++;
		}
		return length;
	}
	public static void main(String[] args) {
		String myString = "Hello, world!";
		int length = getStringLength(myString);
		System.out.println("Length of the string: " + length);
	}
}

