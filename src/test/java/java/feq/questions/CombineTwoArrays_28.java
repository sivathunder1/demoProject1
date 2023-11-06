package java.feq.questions;

import java.util.Arrays;
import java.util.stream.Stream;

public class CombineTwoArrays_28 {
	public static void main(String[] args) {
		 // Sample string arrays
		 String[] array1 = {"Hello", "World"};
		 String[] array2 = {"Java", "8"};
		 // Convert the string arrays to streams
		 Stream<String> stream1 = Arrays.stream(array1);
		 Stream<String> stream2 = Arrays.stream(array2);
		 // Concatenate the streams
		 Stream<String> resultStream = Stream.concat(stream1, stream2);
		 // Convert the concatenated stream back to an array
		 String[] resultArray = resultStream.toArray(String[]::new);
		 // Print the concatenated array
		 System.out.println(Arrays.toString(resultArray));
		 }
		}