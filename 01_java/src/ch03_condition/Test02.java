/**
 * 목표
 * 
 * if의 확장..
 */

package ch03_condition;

public class Test02 {
	public static void main(String[] args) {
		// 삼항연산자(조건연산자)
		int a = 10;
		int b = 5;
		
		int max = (a > b) ? a : b;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		
		if (a > b) max = a;
		else	   max = b;
		
		// 밑에 사항은 권장사항(하나의 상황을 확정지어주고 나머지 상황에 대해서만 처리해주면 된다.)
		max = b;
		if (a > b) max = a;
		
		
		
	}

}
