package ch04_repetition.exam.star;

public class Star07 {
	public static void main(String[] args) {
		
		int length = 5;
		
		for (int i = 0 ; i < length ; i++) {
			
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = length; j > i; j--) {
				System.out.print("*");
			}
			for (int j = length -1; j > i; j--) {
				System.out.print("*");
			}
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			System.out.println();
			
		}
	}

}
