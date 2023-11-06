package java.feq.questions;

public class StarTrianglePattern_13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<=4;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		//Mirror pattern
		for(int i=1;i<=4;i++) {
			for(int j=3;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//Pyramid pattern
		for(int i=1;i<=4;i++) {
			for(int j=3;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		//Printing Alphabet pattern
		int alpha=65;
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(alpha+j)+" ");
			}
			System.out.println();
		}
	
	//Printing Alphabet pattern -2
	int alpha2=65;
	for(int i=0;i<=5;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print((char)alpha2+" ");
		}
		alpha2++;
		System.out.println();
	}
}
}
