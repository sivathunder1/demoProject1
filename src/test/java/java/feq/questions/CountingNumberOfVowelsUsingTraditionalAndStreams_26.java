package java.feq.questions;

import com.google.common.base.CharMatcher;

public class CountingNumberOfVowelsUsingTraditionalAndStreams_26 {
	public static int countVowels(String str) {
		 int count = 0;
		 String lowerStr = str.toLowerCase();
		 for (int i = 0; i < lowerStr.length(); i++) {
		 char ch = lowerStr.charAt(i);
		 if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		 count++;
		 }
		 }
		 return count;
		 }
		 public static long countVowels_Stream(String str) {
		 return str.chars()
		 .mapToObj(ch -> (char) ch)
		 .map(Character::toLowerCase)
		.filter(ch -> "aeiou".contains(String.valueOf(ch)))
		 .count();
		 }
		 public static int countVowels_Guava(String str) {
		 String lowerStr = str.toLowerCase();
		 String vowels = "aeiou";
		 return CharMatcher.anyOf(vowels).countIn(lowerStr);
		 }
		 public static void main(String[] args) {
		 String input = "Hello, World!";
		 int vowelCount = countVowels(input);
		 System.out.println("Number of vowels: " + vowelCount);
		 long vowelStreams = countVowels_Stream("Hello, World!");
		 int vowelCount_guava = countVowels(input);
		 System.out.println("Number of vowels: " + vowelStreams);
		 System.out.println("Number of vowels: " + vowelCount_guava);
		 }
		}
