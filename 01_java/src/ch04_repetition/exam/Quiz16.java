/**
아래와 같이 실행되는 프로그램을 작성하시오
시작단과 종료단은 2 ~ 19단 사이만 가능합니다.
사용자가 시작단에서 -1을 입력할 때 까지 반복합니다.


출력결과>

시작단 입력(종료 : -1) : 22
시작단은 2~19단 까지 가능합니다.
시작단 입력(종료 : -1) : 5
종료단 입력 : 33
종료단은 2~19단 까지 가능합니다.
종료단 입력 : 6
 5 *  1 =   5
 5 *  2 =  10
 5 *  3 =  15
 5 *  4 =  20
 5 *  5 =  25
 5 *  6 =  30
 5 *  7 =  35
 5 *  8 =  40
 5 *  9 =  45
 6 *  1 =   6
 6 *  2 =  12
 6 *  3 =  18
 6 *  4 =  24
 6 *  5 =  30
 6 *  6 =  36
 6 *  7 =  42
 6 *  8 =  48
 6 *  9 =  54
시작단 입력(종료 : -1) : -1
프로그램이 종료되었습니다.

 */
package ch04_repetition.exam;

import java.util.Scanner;

public class Quiz16 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			System.out.print("시작단 입력(종료 : -1) : ");
			int num = sc.nextInt();
			if(num == -1) break;
			
			if (num < 2 || num > 19) {
				System.out.println("시작단은 2~19단 까지 가능합니다.");
				continue;
			} 
			int num2 = 0;
			while(true) {
				
				System.out.print("종료단 입력 : ");
				num2 = sc.nextInt();
				if (num2 < 2 || num2 > 19) System.out.println("종료단은 2~19단 까지 가능합니다.");
				else break;
			}
			
			for(int i = num; i < num2 + 1; i++) {
//				for(int j = 1; j < 9; j++)
				
				for (int j = 1; j < 10; j++) {
					System.out.printf("%d * %d = %d%n", i, j, i*j);
				}
			}
			
			
			
		}
		System.out.println("프로그램이 종료되었습니다.");
		sc.close();

	}
}













