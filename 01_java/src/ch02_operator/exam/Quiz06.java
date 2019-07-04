/**
 * 
 * 	아래와 같이 출력하는 프로그램을 작성하시오
 * 	출력형식 >
 * 
 * 	수를 입력하시오 : 10
 *  수를 입력하시오 : 7
 *  몫 : 1
 *  나머지 : 3
 *  
 *  수를 입력하시오 : 20
 *  수를 입력하시오 : 3
 *  몫 : 6
 *  나머지 : 2	
 * 
 */
package ch02_operator.exam;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하시오 : ");
		int num1 = sc.nextInt();
		System.out.print("수를 입력하시오 : ");
		int num2 = sc.nextInt();
		System.out.println("몫 : " + (num1 / num2));

		System.out.println("나머지 : " + (num1 % num2));
		
		System.out.println();
		
		/*
		 * System.out.print("수를 입력하시오 : "); num1 = sc.nextInt();
		 * System.out.print("수를 입력하시오 : "); num2 = sc.nextInt();
		 * 
		 * 
		 * System.out.println("몫 : " + (num1 / num2));
		 * 
		 * System.out.println("나머지 : " + (num1 % num2));
		 */
		
		sc.close();
		
	}

}
