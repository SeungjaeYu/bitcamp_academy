package ch04_repetition.exam.star;

public class Star04 {

	public static void main(String[] args) {
		
		int length = 5;
		
		for (int i = 0; i < length; i++) {
			
			for (int j = length; j > i + 1; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}

}
