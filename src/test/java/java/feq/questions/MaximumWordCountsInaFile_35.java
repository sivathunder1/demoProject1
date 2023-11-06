package java.feq.questions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MaximumWordCountsInaFile_35 {
	public static void main(String[] args) {
		String filePath = "your_file.txt"; // Replace with the path to your text file
		Map<String, Integer> wordCount = new HashMap<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] words = line.split("\\s+"); // Split the line into words
				for (String word : words) {
					wordCount.merge(word, 1, Integer::sum); // Count word occurrences
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Find the word with the maximum count
		String maxWord = "";
		int maxCount = 0;
		for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
			if (entry.getValue() > maxCount) {
				maxWord = entry.getKey();
				maxCount = entry.getValue();
			}
		}
		System.out.println("Most repeated word: " + maxWord);
		System.out.println("Count: " + maxCount);
	}
}