package java.feq.questions;

import java.util.ArrayList;
import java.util.List;

public class LeaderElements_42 {
	public static void main(String[] args) {
		int[] arr = {16, 17, 4, 3, 5, 2};
		List<Integer> leaders = findLeaders(arr);
		System.out.println("Leaders in the array are:");
		for (int leader : leaders) {
			System.out.print(leader + " ");
		}
	}
	public static List<Integer> findLeaders(int[] arr) {
		List<Integer> leaders = new ArrayList<>();
		int n = arr.length;
		int maxRight = arr[n - 1]; // Initialize the rightmost element as the maximum
		// The rightmost element is always a leader
		leaders.add(maxRight);
		// Iterate the array from the second-to-last element to the first
		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] > maxRight) {
				// Current element is greater than the maximum to the right
				leaders.add(arr[i]);
				maxRight = arr[i]; // Update the maximum
			}
		}
		// Reverse the list to have leaders in the original order
		List<Integer> reversedLeaders = new ArrayList<>();
		for (int i = leaders.size() - 1; i >= 0; i--) {
			reversedLeaders.add(leaders.get(i));
		}
		return reversedLeaders;
	}
}