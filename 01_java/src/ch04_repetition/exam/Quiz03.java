/**
	하나의 수를 입력받은 다음 입력받은 수까지의 짝수, 홀수, 전체 합을 구하는 프로그램을 작성하시오
	
	출력 형식>
	
	수 입력 : _10
	홀수 합 : 25
	짝수 합 : 30
	전체 합 : 55
 */
package ch04_repetition.exam;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수 입력 : ");
		
		int num = sc.nextInt();
		
		int evenSum = 0;
		int oddSum = 0;
		int totalSum = 0;
		
		
		for (int i = 1; i <= num; i++) {
			if(i % 2 == 0) evenSum += i;
			else		   oddSum += i;           
			totalSum += i;
		}
		
		System.out.printf("홀수 합 : %d%n짝수 합 : %d%n전체 합 : %d%n", oddSum , evenSum , totalSum);
		
		sc.close();
		
	}
}










