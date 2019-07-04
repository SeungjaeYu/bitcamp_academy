/**
 * 숫자를 입력하세요 : -7
 * -7의 절대 값 : 7
 * 
 * 숫자를 입력하세요 : 8
 * 8의 절대 값 : 8
 */


package ch03_condition.exam;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		int num1 = num;
		if (num < 0) num *= -1;
		
		System.out.printf("%d의 절대 값 : %d",num1,num);
		
		sc.close();
		
		
	}

}
