/*

1 부터 입력된 수까지의 합을 구하는 프로그램 작성

화면출력>
수를 입력하세요 : -7
0보다 큰수를 입력하세요
수를 입력하세요 : 3
1부터 3까지의 합 : 6

*/
package ch04_repetition.exam;

import java.util.Scanner;

public class Quiz08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		while(num <= 0) {
			System.out.println("0보다 큰수를 입력하세요");
			System.out.print("수를 입력하세요 : ");
			num = sc.nextInt();
		}
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.printf("1부터 %d까지의 합 : %d%n", num , sum);
		
		sc.close();
		
		
	}
}




