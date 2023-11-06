package java.feq.questions;

public class RemoveWhiteSpacesInJava_36 {
	public static void main(String[] args) {
		String input = "This is a string with spaces.";
		String result = input.replaceAll("\\s", "");
		System.out.println(result);
		String input_replace = "This is\na string\twith spaces.";
		String result_replace = input_replace.replace(" ", "").replace("\t",
				"").replace("\n", "");
		System.out.println(result_replace);
		StringBuilder result_sBuilder = new StringBuilder();
		for (char c : input.toCharArray()) {
			if (!Character.isWhitespace(c)) {
				result_sBuilder.append(c);
			}
		}
		System.out.println(result_sBuilder.toString());
	}
}