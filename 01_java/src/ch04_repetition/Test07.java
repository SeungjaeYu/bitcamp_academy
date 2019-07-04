/**
 * 목표
 * 
 * break 이름;
 */

package ch04_repetition;

public class Test07 {
	
	public static void main(String[] args) {
		/*
		 * 
		 * i = 1, k = 1 
		 * i = 2, k = 1 

		for (int i = 1; i < 3; i++) {
			
			for (int k = 1; k < 3; k++) {
				if (k == 2) break;
				System.out.printf("i = %d, k = %d %n", i, k);
				
			}
			
		}
		*/
		
		// i = 1, k = 1 
		outer : // 중첩 반복문이 있을때 이름(alias)을 주고 빠져나올 수 있다.
		for (int i = 1; i < 3; i++) {
			
			for (int k = 1; k < 3; k++) {
				if (k == 2) break outer;
				System.out.printf("i = %d, k = %d %n", i, k);
			}
		}  
	}

}
