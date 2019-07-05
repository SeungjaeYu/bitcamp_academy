/**
 *    20을 16진수로 변환하기
 *    
 *    16 | 20
 *       |  1  -  4
 *          0  -  1
 *         
 *         
 *    20을 8진수로 변환하기
 *    
 *    8 | 20
 *      |  2  -  4
 *         0  -  2
 *  
 *  
 *    20을 2진수로 변환하기
 *    
 *    2 | 20
 *      | 10  -  0 
 *      |  5  -  0 
 *      |  2  -  1 
 *      |  1  -  0 
 *      |  0  -  1 
 *    
	출력형식>
	
	숫자를 입력하세요 : 20
	변환 진법(2, 8, 16) : 2
	20를 2진법으로 변경한 결과 : 10100
	
	
	숫자를 입력하세요 : 20
	변환 진법(2, 8, 16) : 8
	20를 8진법으로 변경한 결과 : 24	
	
	숫자를 입력하세요 : 20
	변환 진법(2, 8, 16) : 16
	20를 16진법으로 변경한 결과 : 14
	
 */
package ch04_repetition.exam;

import java.util.Scanner;

public class Quiz19 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		String result = "";
		int num = 0;
		int num2 = 0;
		int numVal = 0;
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			num = sc.nextInt();
			numVal = num;
			
			if (num == -1) break;
			System.out.print("변환 진법(2, 8, 16) : ");
			num2 = sc.nextInt();
			result = "";
			switch (num2) {
				case 2:
					while (numVal != 0) {
						result = (numVal % 2) + result;
						numVal /= 2;
					}
				break;

				case 8:
					while (numVal != 0) {
						result = (numVal % 8) + result;
						numVal /= 8;
					}
			
				break;
				
				case 16:
					while (numVal != 0) {
						
						
						if(numVal % 16 > 9 && (numVal % 16) < 16) {
								switch ((numVal % 16)) {
								case 10:
									result = 'A' + result;
									break;
								case 11:
									result = 'B' + result;
									break;
								case 12:
									result = 'C' + result;
									break;
								case 13:
									result = 'D' + result;
									break;
								case 14:
									result = 'E' + result;
									break;
								case 15:
									result = 'F' + result;
									break;
								}
								
							
						} else {
							result = (numVal % 16) + result;
						}
						
						numVal /= 16;
						
						
						
					}
				break;
				
				
			}
			
			System.out.printf("%d를 %d진법으로 변경한 결과 : %s%n", num, num2, result);
			
			
		}
		
		sc.close();
		System.out.println("프로그램 종료합니다.");

		
	}
}
