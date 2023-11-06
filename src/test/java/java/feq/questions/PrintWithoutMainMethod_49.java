package java.feq.questions;

public class PrintWithoutMainMethod_49 {
	{
		System.out.println("Hello, World!");
	}
	public static int printHello() {
		System.out.println("Hello, World using return int!");
		return 42; // Return an integer
	}
	{
		int result = printHello();
		System.out.println("Result: " + result);
	}
	public static void main(String[] args) {
		// The main method can be left empty
		printHello();
	}
}