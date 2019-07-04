/**
 * 	증감연산자
 * 	1을 증가하거나 1을 감소시킨다.(++, --)
 */
package ch02_operator;

public class Test11 {
	public static void main(String[] args) {
		int a = 5;
		
		// a = a + 1;
		// b = a;
		int b = ++a;
		System.out.println(a);	// 6
		System.out.println(b);	// 6
		
		
		// b = a;
		// a = a + 1;
		int b2 = a++;
		System.out.println(a);	// 7
		System.out.println(b2);	// 6
		
	}
}








