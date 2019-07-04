package ch02_operator.exam;
/**
 * 
 * 	사용자가 입력한 사칙연산의 종류 값에 따라 아래와 같이 적용
 * 	- 1 : +
 *  - 2 : -
 *  - 3 : *
 *  - 4 : /
 *  
 *  사칙연산 종류를 입력 : 1
 *  숫자1 : 10
 *  숫자2 : 2
 *  10 + 2 = 12
 *  
 *  사칙연산 종류를 입력 : 2
 *  숫자1 : 10
 *  숫자2 : 2
 *  10 - 2 = 8
 *
 *  사칙연산 종류를 입력 : 3
 *  숫자1 : 10
 *  숫자2 : 2
 *  10 * 2 = 20
 *  
 *  사칙연산 종류를 입력 : 4
 *  숫자1 : 10
 *  숫자2 : 2
 *  10 / 2 = 5
*/

import java.util.Scanner;

public class Quiz11 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사칙연산 종류를 입력 :");
		int point = sc.nextInt();
		System.out.print("숫자 1 :");
		int num1 = sc.nextInt();
		System.out.print("숫자 2 :");
		int num2 = sc.nextInt();
		String arg = (point == 1) ? "+" :
					 (point == 2) ? "-"	:
					 (point == 3) ? "*"	:
					 (point == 4) ? "/" :
					 "계산식오류";
		/*
		 * if(arg.equals("계산식오류")) { System.out.println(arg);
		 * System.exit(0); }
		 */
		int val = (point == 1) ? num1 + num2 :
			 	  (point == 2) ? num1 - num2 :
			 	  (point == 3) ? num1 * num2 :
			 	  (point == 4) ? num1 / num2 :
			 	  0;

		
		System.out.println(num1 + " " + arg + " " + num2 + " = " + val);
		
		sc.close();
	}

}
