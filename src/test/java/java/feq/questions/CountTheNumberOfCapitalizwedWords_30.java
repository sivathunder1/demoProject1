package java.feq.questions;

public class CountTheNumberOfCapitalizwedWords_30 {
	public static void main(String[] args) {
		 String capitalizedString = "ThisIsAExampleStringWithCapitalizedWords";
		 // Split the capitalized string into words based on capital letters
		 String[] words = capitalizedString.split("(?=[A-Z])");
		 // Count the number of words
		 int wordCount = words.length;
		 System.out.println("Capitalized String: " + capitalizedString);
		 System.out.println("Word Count using Regex: " + wordCount);


		 int length = capitalizedString.length();
		 for (int i = 0; i < length; i++) {
		 if (Character.isUpperCase(capitalizedString.charAt(i)) && i > 0) {
		 wordCount++;
		 }
		 }
		 // Add 1 to account for the first word
		 wordCount++;
		 System.out.println("Capitalized String: " + capitalizedString);
		 System.out.println("Word Count using Traditional: " + wordCount);
		 }
		}
