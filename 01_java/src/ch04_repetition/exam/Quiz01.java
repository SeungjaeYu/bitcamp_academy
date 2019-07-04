/*
 *   1부터 100까지의 숫자를 화면에 출력한다.
 *   단, 10개씩 줄단위 출력
 *   
 *    1  2  3   ... 10
 *   11 12 13   ... 20
 *   ...
 *   91..          100
 */
package ch04_repetition.exam;

public class Quiz01 {
	public static void main(String[] args) {
		
		for(int i = 1; i < 101; i++) {
			System.out.print(i + "\t");
			if (i % 10 == 0) System.out.println();
		}
		
	}
}











