package java.feq.questions;

public class Null_Argument_InString_Overloading_08 {
	public static void test(String s) {
		System.out.println("String Argument");
	}
	public static void test(Object o) {
		System.out.println("Object Argument");
	}
	public static void main(String[] args) {
		test(null);
	}}

