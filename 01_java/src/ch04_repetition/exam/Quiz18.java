/*
1부터 1000사이의 숫자를 맞추는 게임입니다.(총 10회)
1회. 숫자를 입력하세요(1 - 1000) : 3
3보다 큰 값 입니다.
2회. 숫자를 입력하세요(1 - 1000) : 500
500보다 작은 값 입니다.
3회. 숫자를 입력하세요(1 - 1000) : 250
정답입니다.

1부터 1000사이의 숫자를 맞추는 게임입니다.(총 10회)
1회. 숫자를 입력하세요(1 - 1000) : 3
3보다 큰 값 입니다.
생략......
10회. 숫자를 입력하세요(1 - 1000) : 3
3보다 큰 값 입니다.
10회안에 맞추기 게임에 실패하였습니다.
정답은 85입니다.
 */
package ch04_repetition.exam;

import java.util.Random;
import java.util.Scanner;

public class Quiz18 {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int num = r.nextInt(1000) + 1;
		int num2 = 0;
		int cnt = 1;
	
		while(cnt <= 10) {
			
			System.out.printf("%d회. 숫자를 입력하세요(1 - 1000) : ", cnt);
			num2 = sc.nextInt();
			
			if (num == num2) {
				System.out.println("정답입니다.");
				break;
			} else if (num > num2) {
				System.out.printf("%d보다 큰 값 입니다.%n", num2);
			} else {
				System.out.printf("%d보다 작은 값 입니다.%n", num2);
			}

			
			
			cnt++;
			if (cnt == 11) {
				System.out.println("10회안에 맞추기 게임에 실패하였습니다.");
				System.out.printf("정답은 %d 입니다.%n", num);
			}
			
		}
		
		
		sc.close();
		
		
		
		
		

	}
}




