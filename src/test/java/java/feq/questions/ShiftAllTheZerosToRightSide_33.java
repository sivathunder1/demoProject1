package java.feq.questions;

import java.util.ArrayList;
import java.util.List;

public class ShiftAllTheZerosToRightSide_33 {
	public static void shiftZerosRight(int[] arr) {
		int nonZeroIndex = 0;
		// Move non-zero elements to the left
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[nonZeroIndex] = arr[i];
				nonZeroIndex++;
			}
		}
		// Fill the remaining positions with zeros
		while (nonZeroIndex < arr.length) {
			arr[nonZeroIndex] = 0;
			nonZeroIndex++;
		}
	}
	public static void shiftZerosRight_ArrayList(List<Integer> list) {
		int nonZeroIndex = 0;
		// Move non-zero elements to the left
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) != 0) {
				list.set(nonZeroIndex, list.get(i));
				nonZeroIndex++;
			}
		}
		// Fill the remaining positions with zeros
		while (nonZeroIndex < list.size()) {
			list.set(nonZeroIndex, 0);
			nonZeroIndex++;
		}
	}
	public static void main(String[] args) {
		int[] array = {0, 2, 0, 4, 0, 6, 0, 8, 10, 0};
		// Function to shift zeros to the right
		shiftZerosRight(array);
		// Print the modified array
		for (int value : array) {
			System.out.print(value + " ");
		}
		List<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(2);
		list.add(0);
		list.add(4);
		list.add(0);
		list.add(6);
		list.add(0);
		list.add(8);
		list.add(10);
		list.add(0);
		// Function to shift zeros to the right
		shiftZerosRight_ArrayList(list);
		// Print the modified ArrayList
		for (int value : list) {
			System.out.print(value + " ");
		}
	}
}