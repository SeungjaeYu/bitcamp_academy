/**
	화면에서 수를 입력받고 입력받은 수가 몇자리인지 출력하는 프로그램을 작성하시오
	
	입력 : 8722
	8722은 4자리입니다.
	
	입력 : 872
	872은 3자리입니다.
 */
package ch04_repetition.exam;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();
		int remainder = num;
		int cnt = 0;
		
		while (remainder >= 1) {
			remainder /= 10;
			remainder = remainder / 10;
			cnt += 1;
		}
		System.out.printf("%d은 %d자리입니다.", num , cnt);		
		
		sc.close();

	}
}
