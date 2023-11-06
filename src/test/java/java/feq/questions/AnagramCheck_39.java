package java.feq.questions;

import java.util.Arrays;

public class AnagramCheck_39 {
	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";
		boolean areAnagrams = areAnagrams(str1, str2);
		if (areAnagrams) {
			System.out.println(str1 + " and " + str2 + " are anagrams.");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagrams.");
		}
	}
	public static boolean areAnagrams(String str1, String str2) {
		// Remove spaces and convert to lowercase for case-insensitive comparison
		str1 = str1.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replaceAll("\\s", "").toLowerCase();
		// Check if the sorted strings are equal
		return Arrays.equals(sortString(str1), sortString(str2));
	}
	public static char[] sortString(String str) {
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);
		return charArray;
	}
}