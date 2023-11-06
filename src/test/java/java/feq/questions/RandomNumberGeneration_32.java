package java.feq.questions;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberGeneration_32 {
	public static void main(String[] args) {
		Random random = new Random();
		// Generate a random integer between 0 (inclusive) and 100 (exclusive)
		int randomInt = random.nextInt(1000000000);
		System.out.println("Random Integer: " + randomInt);
		// Generate a random double between 0 (inclusive) and 1 (exclusive)
		double randomDouble = random.nextDouble();
		System.out.println("Random Double: " + randomDouble);
		int randomInt_ThreadLocal = ThreadLocalRandom.current().nextInt(9, 100);
		System.out.println("Random Integer: " + randomInt_ThreadLocal);
		// Generate a random double between 0 (inclusive) and 1 (exclusive)
		double randomDouble_ThreadLocal = ThreadLocalRandom.current().nextDouble(0, 1);
		System.out.println("Random Double: " + randomDouble_ThreadLocal);
		StringBuilder phoneNumber = new StringBuilder("9");
		// Generate the remaining 9 digits
		for (int i = 1; i < 10; i++) {
			int randomDigit = ThreadLocalRandom.current().nextInt(0, 10);
			phoneNumber.append(randomDigit);
		}
		System.out.println("Random 10-Digit Phone Number: " + phoneNumber.toString());
	}
}