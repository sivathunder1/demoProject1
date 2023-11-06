package java.feq.questions;

public class NumberOfOccouranceOfCharactersInAStringWithStreams_25 {
	 public static long countOccurrences(String str, char character) {
	 return str.chars() // Convert the string to an IntStream of characters
	 .filter(c -> c == character) // Filter characters that match the	target character
	 .count(); // Count the filtered characters
	 }
	 public static void main(String[] args) {
	 String inputString = "Hello, World!";
	 char targetCharacter = 'o';
	 long count = countOccurrences(inputString, targetCharacter);
	 System.out.println("Number of occurrences of '" + targetCharacter + "' in the string: " + count);
	 }
	}

