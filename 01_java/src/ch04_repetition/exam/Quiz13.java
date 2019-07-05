/**

1 부터 100사이의 숫자 중에서 솟수를 출력하는 프로그램을 작성하시오.
솟수는 그 수 자신과 1을 제외한 다른 정수로는 나누어 떨어지지 않는 정수 

3이 소수인지 판별 : 
   3 % 1 == 0 (참)
   3 % 2 == 0 (거짓)
   3 % 3 == 0 (참)
참인 경우가 2개인 경우 소수

 */
package ch04_repetition.exam;

import java.util.Random;

public class Quiz13 {
	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(101) + 1;
		int cnt = 0;
		for(int i = 1; i < num + 1; i++) {
			if (num % i == 0) cnt += 1;
		}
		System.out.printf("%d은(는) 소수",num);
		if(cnt == 2) System.out.println("입니다.");
		else System.out.println("가 아닙니다.");
		
		
		
		

	}
}
