/**
 * 
 * 	화면에서 세개의 숫자를 입력받고 입력된 수 중에서 최대와 최소값윽 찾아서
 *  출력하는 프로그램을 작성하시오
 *  
 *  출력형식>
 *  첫번째 숫자를 입력하세요 : 10
 *  두번째 숫자를 입력하세요 : 3
 *  세번째 숫자를 입력하세요 : 20
 *  중간값은 10입니다.
 */


package ch03_condition.exam;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		int num2 = sc.nextInt();
		System.out.print("세번째 숫자를 입력하세요 : ");
		int num3 = sc.nextInt();
		
		
		//swap 이용 중간값 찾기
		
		int tmp;
		
		if(num1 < num2) { 
			tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		if(num1 < num3) {
			tmp = num1;
			num1 = num3;
			num3 = tmp;
		}
		if(num2 < num3) {
			tmp = num2;
			num2 = num3;
			num3 = tmp;
		}
		
		System.out.println(num2);
		
		
		sc.close();
		
		
	}

}
