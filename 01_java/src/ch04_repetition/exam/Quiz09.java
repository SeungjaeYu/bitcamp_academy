/**

2부터 10사이의 수를 입력 받아 배수만을 출력하는 프로그램을 작성하시오
배수는 10개 출력합니다.

출력형식 >
수를 입력하세요(2 - 10) : 6
6의 배수 : 6 12 18 24 30 36 42 48 54 60 

 */
package ch04_repetition.exam;

import java.util.Scanner;

public class Quiz09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int multiple = 0;
		
		int multi = 10;
		//boolean flag = true;
		
		while(true) {
			System.out.print("수를 입력하세요(2 - 10) : ");
			multiple = sc.nextInt();
			if(multiple >= 2 && multiple <=10) break;
			else System.out.printf("2와 10 사이의 수를 입력하세요!! %n");
			
			
		}
		
		System.out.printf("%d의 배수 : ",multiple);
		for (int i = 1; i <= multi; i++) {
			System.out.print(" " + multiple * i);
		}
		System.out.println();
		
		sc.close();
		

	}
}
