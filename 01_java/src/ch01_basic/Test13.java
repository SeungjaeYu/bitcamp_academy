/**
 * 목표
 * 
 * 상수의 사용법을 이해하자
 */

package ch01_basic;

public class Test13 {
	public static void main(String[] args) {
		final int HOUR = 24;
		System.out.println(HOUR / 2);
		
		//The final local variable HOUR cannot be assigned.
		//It must be blank and not using a compound assignment
		//HOUR = 22;
		System.out.println(HOUR / 2);
		
		
		//The literal 21147483647 of type int is out of range 
		//int val = 21147483647;
		
		//long val = 21147483647L; // 파일 크기, 시간값, 통계 등
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}
}
