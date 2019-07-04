package ch04_repetition.exam.star;

public class Star01 {

	public static void main(String[] args) {
		
		int length = 5;
		
		for(int i = 1; i < length + 1; i++) {
			
			for(int j = 1; j < length + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
