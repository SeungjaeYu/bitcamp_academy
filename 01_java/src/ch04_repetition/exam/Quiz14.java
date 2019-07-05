/**
 
10부터 20사이의 랜덤한 숫자를 생성한 다음 생성된 숫자 만큼의 소수를 출력하는 프로그램을 작성하시오 
 
출력형식> 
총 17개의 솟수를 출력합니다.
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59  
  
 */
package ch04_repetition.exam;

import java.util.Random;

public class Quiz14 {
	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(11) + 10;
		
		int count = 0;
		System.out.printf("총 %d개의 솟수를 출력합니다.", num);
		int cnt = 0;
			
			for(int i = 2; i < num * 10; i++) {
				
				cnt = 0;
				for(int j = 1; j <= i ; j++) {
					if (i % j == 0) cnt += 1;
				}
				if (cnt == 2) {
					System.out.printf(" %d ", i);
					count += 1;
				}
				
				if(count == num) break;
			}
			
			
		System.out.println();
			
			
			
			
			
		
		
		

	}
}
