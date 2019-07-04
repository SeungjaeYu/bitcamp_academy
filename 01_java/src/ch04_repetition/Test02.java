/**
 * 목표
 * 
 * 반복제어문 : for문의 기초 이해하기
 */
package ch04_repetition;

public class Test02 {
	public static void main(String[] args) {
		/*
		// 1부터 10까지 출력하는 반복문 작성
		for (int i = 1 ; i <=10 ; i++) {
			System.out.println(i);
		}
		*/
		
		/*
		// 10, 20, 30, 40, 50 을 출력하는 반복문 작성
		for (int i = 10 ; i <= 50 ; i += 10) {
			System.out.println(i);
		}
		for (int i = 1 ; i < 6 ; i++) {
			System.out.println(i * 10);
		}
		*/
		/*
		int num = 10;
		for (int i = 1; i < 6; i++) {
			System.out.println(num);
			num +=10;
		}
		*/
		
		int num2 = 10;
		for (int i = 1; i < 6; i++, num2 += 10) {
			System.out.println(num2);
		}
		
	}

}
