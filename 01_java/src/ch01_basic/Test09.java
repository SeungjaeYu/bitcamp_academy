/**
 * 목표
 * 
 * printf 에 대해서 상세하게 이해하자..
 */

package ch01_basic;

public class Test09 {
	public static void main(String[] args) {
		int val = 22;
		System.out.printf("|%d|%n",val);
		
		// |   22|
		System.out.printf("|%5d|%n",val);
		
		// |22   |
		System.out.printf("|%-5d|%n",val);
		
		// |00022|
		System.out.printf("|%05d|%n",val); //ex) 날짜 출력시에 20190909 -> 포맷팅으로 자동 처리
		
		double val2 = 22.1;
		
		// |22.100000|
		System.out.printf("|%f|%n",val2); 
		
		// |22.10|
		System.out.printf("|%.2f|%n",val2); 
		
		// | 22.10|
		System.out.printf("|%6.2f|%n",val2); 
		
		// |12321832.12|
		System.out.printf("|%6.2f|%n",12321832.123); //앞자리 전체 숫자가 초과될 시 전부 출력(최소공간을 출력)
		
		System.out.printf("|%1$10d|%1$10d|%n",1212);
				
		// ,도 사용 가능하다 -> ,는 기본 3자리로 잘라준다.
		System.out.printf("%,d",1212121212);
	}
}








