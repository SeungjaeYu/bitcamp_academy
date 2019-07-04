/**
 * 
 * 	아래와 같이 출력하는 프로그램을 작성하시오
 *  출력형식 >
 *  
 *  초를 입력하시오 : 7600
 *  입력된 7600초는 2시간 06분 40초 입니다.
 * 
 */
package ch02_operator.exam;

import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("초를 입력하시오 : ");
		int sec = sc.nextInt();
		int time = sec / (60 * 60);
		int minute = sec % (60 * 60) / 60;
		int second =  sec % (60 * 60) % 60;
		System.out.printf("입력된 %d초는 %d시간 %02d분 %02d초입니다.\n",sec, time, minute, second );
		
		
		
		sc.close();
		
	}

}
