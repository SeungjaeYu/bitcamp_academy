/**
 * 목표
 * 
 * 논리 연산자(&&, ||)를 이해하자
 * 조건식 && 조건식 -> 참, 거짓이 반환
 * 조건식 || 조건식 -> 참, 거짓이 반환
 */
package ch02_operator;

public class Test12 {
	public static void main(String[] args) {
		/*
		 *  True	&&	True	-> True
		 * 	True	&&	False	-> False
		 * 	False	&&	True	-> False
		 * 	False	&&	False	-> False
		 
		 *  True	||	True	-> True
		 * 	True	||	False	-> True
		 * 	False	||	True	-> True
		 * 	False	||	False	-> False
		 */
		
		int a = 20;
		int b = 10;
		// &는 앞에 결과 관계없이 무조건 뒤에 결과도 수행
		// &&는 앞에 결과가 만족하지 않는다면 뒤에것은 수행하지 않음
		boolean result = (a < b) && (++a % 2 == 0); // 앞에 조건이 false기 때문에 뒤에 ++a는 연산하지 않는다.(&&경우)
		System.out.println(a);
		System.out.println(result);
		
		
	}
}








