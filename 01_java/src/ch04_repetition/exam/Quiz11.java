/**

하나의 숫자를 입력 받아 완전수인지 판단하는 프로그램을 작성하시오
완전수 판단 : 자기 자신을 제외한 약수의 합이 자기 자신과 같은 수
예를 들어 > 6은 1, 2, 3 이 약수이며, 약수의 합이 6이다. 
    
출력형식 > 
수를 입력하세요 : 6
6은 완전수 입니다.

 */
package ch04_repetition.exam;

import java.util.Scanner;

public class Quiz11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수를 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i < num ; i++) {
			if(num % i == 0) sum += i;
		}
		System.out.printf("%d은 완전수", num);
		if(num == sum) System.out.println(" 입니다.");
		else System.out.println("가 아닙니다.");
		
		
		
		
		sc.close();
	}
}
