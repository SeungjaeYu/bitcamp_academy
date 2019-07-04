/**
 * 목표
 * 
 * 하나의 자바파일안에 여러개의 클래스 선언이 가능함을 이해한다.
 */

package ch01_basic;

/*
 * 하나의 파일에 여러개의 클래스를 선언할 때 주의점..
 * 
 * public이 붙은 클래스가 존재하지 않는다면 모든 클래스가 파일명으로 설정이 가능하다.(문법적 에러가 발생하지 않는다.)
 * 
 * 만약, public 이 선언된 클래스가 존재한다면 그 클래스가 파일이름으로 설정되어야 한다.
 * 
 * 결론...
 * 여러개의 클래스가 선언될 수 있지만 public이 선언되는 클래스는 하나만 존재해야 한다.
 */
class Test10A {}
class Test10B {}
public class Test10 {
	public static void main(String[] args) {
		
	}
	
}







