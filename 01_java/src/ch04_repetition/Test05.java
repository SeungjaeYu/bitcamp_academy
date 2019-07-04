/**
 * 목표
 * 
 * while문을 이요한 반복
 * 
 * 형식>
 * while(조건식) {
 * 	 참일 경우 실행할 문장들
 * }
 * 
 * 횟수가 정해져 있는 경우 - for문이 편함.
 * 횟수가 정해져 있지 않은 경우 - while문이 편함.
 */
package ch04_repetition;

public class Test05 {
	
	public static void main(String[] args) {
		
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}  // 해당 스코프에서만 변수 사용하기 때문에 충돌이 나지 않는다.
		
		int i = 1;
		
		while(i < 11) {
			System.out.println(i);
			i++;
		}
		
		i = 1; // i의 값을 계속 초기화해서 사용해줘야 한다.
		while(i < 11) {
			System.out.println(i);
			i++;
		} 
		
		
	}
	

}
