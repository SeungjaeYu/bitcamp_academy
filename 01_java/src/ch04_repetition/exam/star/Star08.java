package ch04_repetition.exam.star;

public class Star08 {
	public static void main(String[] args) {
		
		int length = 5;
		
		for (int i = 0; i < length; i++) {
			
			for (int j = length; j > i + 1; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			for (int j = 0; j > i + 1; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		
		for (int i = 0; i < length ; i++) {
			
			for (int k = 0; k < i + 1; k++) {
				System.out.print(" ");
			}
			for (int j = length - 2; j > i; j--) {
				System.out.print("*");
			}
			for (int j = length - 1; j > i; j--) {
				System.out.print("*");
			}
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			
			System.out.println();
			
		}
	}

}
