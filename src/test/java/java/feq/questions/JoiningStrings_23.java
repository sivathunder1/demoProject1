package java.feq.questions;

import java.util.StringJoiner;

public class JoiningStrings_23 {
	 public static void main(String[] args) {
	 // Create a StringJoiner with a delimiter (e.g., comma) and optional 	prefix and suffix
	 StringJoiner joiner = new StringJoiner(", ", "[", "]");
	 // Add strings to the StringJoiner
	 joiner.add("Apple");
	 joiner.add("Banana");
	 joiner.add("Cherry");
	 // Get the combined string
	 String result = joiner.toString();
	 // Print the result
	 System.out.println(result);
	 }
	}

