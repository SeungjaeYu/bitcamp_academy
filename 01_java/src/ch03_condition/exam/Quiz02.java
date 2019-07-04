/**
 * 
 * 	마트에서 할인 행사를 진행합니다. 물건값에 따라서 각각의 할인율이 적용됩니다. .
 *  
 *  물건값	10만원 이하		30만원 이하		100만원 이하 		100만원 초과
 *  할인율	3%				5%				8%					10%
 *  
 *  화면에서 물건값을 입력 받아 할인된 금액을 계산하여 출력하는 프로그램을 작성하시오
 *  
 *  출력예시>
 *  물건값을 입력하세요(만원) :		10
 *  할인된 금액은 97000 원입니다.
 *  물건값을 입력하세요(만원) :		20
 *  할인된 금액은 190000 원입니다.
 */


package ch03_condition.exam;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("물건값을 입력하세요(만원) : ");
		int price = sc.nextInt() * 10000;
		
		if (price > 1000000) price *= 0.9;
		else if (price <= 1000000 && price > 300000) price *= 0.92;
		else if (price <= 300000 && price > 100000) price *= 0.95;
		else price *= 0.97;
			
		System.out.printf("할인된 금액은 %d 원입니다.",price);
		
		sc.close();
		
		
	}

}
