/**
 * 목표
 * 
 * 반복제어문 : for문의 기초 이해하기
 */
package ch04_repetition;

public class Test03 {
	
	public static void main(String[] args) {
		
		for (int i = 1 ; i < 11; i++) {
			System.out.println(i);
		}
		
		// 1번 경우
		int i = 1;
		for ( ; i < 11; i++) {
			System.out.println(i);
		}
		
		// 2번 경우
		int j = 1;
		for ( ; j < 11; ) {
			System.out.println(j++);
		} 
		
		// k 변수는 자신이 선언된 블럭 안에서만 사용 가능하다.
		for (int k = 1; k < 5; k++) {
			System.out.println(k);
		}
		//System.out.println(k);	// k 접근 불가능 : 에러발생
		
		
		// 무한반복 함..
		for (;;) {
			System.out.println("무한반복");
		}
		
		// System.out.println("끝"); 무한루프기 때문에 에러 발생 실행할 수 없는 코드
		
		
		
	}
	

}
