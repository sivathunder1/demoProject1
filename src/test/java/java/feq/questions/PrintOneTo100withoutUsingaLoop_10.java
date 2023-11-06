package java.feq.questions;

import java.util.stream.IntStream;

public class PrintOneTo100withoutUsingaLoop_10 {
	public static void printNum(int num) {
		if(num<=100) {
			System.out.println(num);
			num++;
			printNum(num);
		}
	}
	public static void main(String[] args) {
		//using recursive function
		printNum(1);
		//using java Streams
		IntStream.range(1, 101).forEach(e->System.out.println(e));
	}
}



