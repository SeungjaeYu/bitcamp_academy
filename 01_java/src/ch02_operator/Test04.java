package ch02_operator;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = keyboard.nextInt();
		keyboard.nextLine(); // 입력된 \r\n값을 제거 해야 한다.  nextInt() 사용 후에 \r\n이 남아 있기 때문에
		//다음 nextLine()에서 \r\n을 읽기 때문에 아무 값이 안나온다.
		System.out.println("입력된 나이 : " + age);
		
		System.out.print("주소 : ");
		String addr = keyboard.nextLine();
		System.out.println("입력된 주소 : " + addr);
		keyboard.close();
	}
	

}
