package java.feq.questions;

public class SwappingTwoVariablesWithoutUsingThridVariable_18 {

	public static void main(String a[])
	{
		int x = 3;
		int y = 5;
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swapping:"
				+ " x = " + x + ", y = " + y);
	}
}