/**
 * 
 * 	아래와 같이 출력하는 프로그램을 작성하시오
 * 
 * 	환율 계산 : 1달러당 1088.11 원
 *  출력시 소수점 아래 2자리만 출력
 *  
 *  출력형식 >
 *  
 *  달러를 입력하시오 : 30
 *  원화 : 32643.30원
 *  
 *  달러를 입력하시오 : 100
 *  원화 : 108811.00원
 * 
 */
package ch02_operator.exam;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		final double WON = 1_088.11; // 처음보는 형식
		Scanner sc = new Scanner(System.in);
		System.out.print("달러를 입력하시오 : ");
		int num1 = sc.nextInt();
		
		System.out.printf("원화 : %.2f원" , num1 * WON );

		sc.close();
		
	}

}
