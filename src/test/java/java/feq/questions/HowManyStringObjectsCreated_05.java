package java.feq.questions;

public class HowManyStringObjectsCreated_05 {
	 public static void main(String[] args) {
	 String s1 = "a";
	 String s2 = "a";
	 String s3 = new String("a");
	 System.out.println("s1: "+s1.hashCode());
	 System.out.println("s2: "+s2.hashCode());
	 System.out.println("s3: "+s3.hashCode());
	 }
	}

