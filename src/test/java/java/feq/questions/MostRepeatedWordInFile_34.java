package java.feq.questions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MostRepeatedWordInFile_34 {
	public static void main(String[] args) {
		String filePath = "your_file.txt"; // Replace with the path to your text file
		Map<String, Integer> wordCount = new HashMap<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] words = line.split("\\s+"); // Split the line into words
				for (String word : words) {
					word = word.toLowerCase(); // Normalize the word to lowercase
					wordCount.put(word, wordCount.getOrDefault(word, 0) + 1); // Count wordoccurrences
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Find the most repeated word
		String mostRepeatedWord = null;
		int maxCount = 0;
		for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
			if (entry.getValue() > maxCount) {
				mostRepeatedWord = entry.getKey();
				maxCount = entry.getValue();
			}
		}
		System.out.println("Most repeated word: " + mostRepeatedWord);
		System.out.println("Count: " + maxCount);
	}
}
