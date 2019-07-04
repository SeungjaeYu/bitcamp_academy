/**
 * 
 * 	화면에서 세개의 숫자를 입력받고 입력된 수 중에서 최대와 최소값윽 찾아서
 *  출력하는 프로그램을 작성하시오
 *  
 *  출력형식>
 *  첫번째 숫자를 입력하세요 : 10
 *  두번째 숫자를 입력하세요 : 6
 *  세번째 숫자를 입력하세요 : 17
 *  최대값 : 17, 최소값 : 6
 */


package ch03_condition.exam;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		int num2 = sc.nextInt();
		System.out.print("세번째 숫자를 입력하세요 : ");
		int num3 = sc.nextInt();
		
		int max = num3;
		int min = num3;
		
		
		if(num1 > num2 && num1 > num3) max = num1;
		else if(num1 < num2 && num2 > num3) max = num2;
		else max = num3;
		
		if(num1 < num2 && num1 < num3) min = num1;
		else if(num1 > num2 && num2 < num3) min = num2;
		else min = num3;
		
		
		System.out.printf("최대값 : %d, 최소값 : %d",max,min);
		
		
		
		sc.close();
		
		
	}

}
