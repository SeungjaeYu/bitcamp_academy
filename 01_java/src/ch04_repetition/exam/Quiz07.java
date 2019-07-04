/**
시간을 아래와 같이 출력하는 프로그램을 작성하시오

출력형식 > 
-------------------
0 시
-------------------
00:00
00:01
00:02
00:03
...
00:59
-------------------
1 시
-------------------
01:00
01:01
...
...
-------------------
11 시
-------------------
11:54
11:55
11:56
11:57
11:58
11:59
 */
package ch04_repetition.exam;

public class Quiz07 {
	public static void main(String[] args) {
		
		for (int i = 0; i <= 11; i++) {
			System.out.println("-------------------");
			System.out.println(i + " 시");
			System.out.println("-------------------");
			for (int j = 0; j < 60; j++) {
				System.out.printf("%02d:", i);
				System.out.printf("%02d%n", j);
			}
		}
		
		
		
		

	}  
}  