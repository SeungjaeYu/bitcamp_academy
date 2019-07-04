package ch04_repetition.exam.star;

public class Star03 {

	public static void main(String[] args) {
		
		int length = 5;
		
		for(int i = 1; i < length + 1; i++) {
			
			for(int j = (length + 1) - i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
