package java.feq.questions;

public class ExecutingCommandsInJava_27 {
	//The code gets executed because of u000d and followed by code
	public static void main(String[] args) {
		//hi this is my java code(' \u000d System.out.println("Commented Code");
		System.out.println("Java");
		//The code gets executed because of '\'u000d and followed by code and its a unicode
		int value=20;
		// \u000dvalue=30;
		System.out.println(value);
	}
}