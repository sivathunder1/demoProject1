package java.feq.questions;

import java.util.Arrays;

import com.google.common.primitives.Doubles;

public class CalculateAverageOfArrayUsingSteamsAndGuava_29 {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		double[] array_guava = {1, 2, 3, 4, 5};
		int sum = 0;
		for (int num : array) {
			sum += num;
		}
		double average = (double) sum / array.length;
		System.out.println("Average using a simple loop: " + average);

		double average_streams = Arrays.stream(array).average().orElse(0.0);
		System.out.println("Average using Java 8 streams: " + average_streams);

		double average_Guava = Doubles.asList(array_guava).stream().mapToDouble(Double::doubleValue).average().orElse(0.0)
				;
		System.out.println("Average using Google Guava: " + average_Guava);
	}
}