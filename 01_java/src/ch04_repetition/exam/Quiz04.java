/**
	랜덤한 숫자를 5개 생성하고 생성된 숫자의 합계와 평균을 구하는 프로그램을 작성하시오
	
	출력형식 > 
	생성된 숫자 : 44 89 74 7 47 
	합계 : 261
	평균 : 52.20
 */
package ch04_repetition.exam;

import java.util.Random;

public class Quiz04 {
	public static void main(String[] args) {
		
		Random r = new Random();
		int 	sum = 0;
		int     num;
		System.out.print("생성된 숫자 : ");
		for (int i = 0 ; i < 5 ; i++) {
			num = r.nextInt(100);
			System.out.print(num + " ");
			sum += num;
		}
		System.out.printf("%n합계 : %d%n평균 : %.2f%n", sum  ,(double) sum / 5 );
		
		
		
		
		
		
		
		

	}
}
