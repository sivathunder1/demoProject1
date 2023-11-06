package java.feq.questions;

public class ReverseString_12 { 
	public static void reverseStringUsingStringBuilder(String s) {
	StringBuilder build = new StringBuilder(s);
	StringBuilder reversed = build;
	System.out.println(reversed.reverse());
}
public static void reverseStringManually(String s) {
	String str = s;
	String rstr = "";
	char ch;
	for (int i=0; i<str.length();i++) {
		ch= str.charAt(i);
		System.out.println(ch);
		rstr = ch+rstr;
	}
	System.out.println("Reverse String : "+rstr);
}
public static void main(String[] args) {
	reverseStringUsingStringBuilder("Siva");
	reverseStringManually("Siva");
}
}




