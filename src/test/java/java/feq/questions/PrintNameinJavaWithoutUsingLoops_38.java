package java.feq.questions;

public class PrintNameinJavaWithoutUsingLoops_38 {
	public static void main(String[] args) {
		printName(1, 1000);
	}
	public static void printName(int count, int maxCount) {
		if (count <= maxCount) {
			System.out.println("Your Name (Count: " + count + ")");
			printName(count + 1, maxCount);
		}
	}
}