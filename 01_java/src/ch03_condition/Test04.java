/**
 * 목표
 * 
 * switch 문을 이해한다.
 * 
 * 형식
 * 
 * 수식 자리에 올 수 있는 것들
 * -	1.4	버전까지 :	byte, short, char, int(data type) -> long(X) 올 수 없다.
 * 		byte b = 100;
 * 		short s = 100;
 * 		int i = 100;
 * 		long l = 100;
 * 		char c = 'a'; (X)
 * 		char c = 'a';
 * 		
 * -	1.5 버전에 추가 : enum(가능하다)
 * -	1.7 버전에 추가 : String
 * 
 *  switch	(1.1) {}	 (X)
 *  switch	('a') {}	 (O)
 *  switch	("abc") {}	 (O)
 *  
 * - switch 문은 "같다" 비교만 가능함
 * int a = 2;
 * if (a == 1) {}
 * else if (a == 2) {}
 * else {}
 * 
 * switch(a) {
 * 		case 1:
 * 	
 * 		case 2:
 * 
 * 		default:
 * 
 * }
 * 
 * 해당하는 case 문을 찾은 다음 switch 블럭을 빠져나오게 하려면??
 * break; 사용해야 한다.
 * 
 * switch(수식) {
 * 		case 값1:		// 수식 == 값1이 동일하다.
 * 			수식이 값1과 동일할 때 수행할 문장들...
 * 		case 값2:		// 수식 == 값2이 동일하다.
 * 			수식이 값2과 동일할 때 수행할 문장들...
 * 		default:
 * 			위의 case 에 일치하는 것이 없을 때 수행할 문장들..		
 * }
 */

package ch03_condition;

public class Test04 {
	public static void main(String[] args) {
		int a = 2;
		
		switch(a) {
		case 1:
			System.out.println("a는 1입니다.");
			break;
		case 2:
			System.out.println("a는 2입니다.");
			break;
		default:
			System.out.println("위에 해당 하는 경우 없음");
			//break; 맨 마지막이기 때문에 써도 안써도 상관없다.
		}
		
		String food = "짜장면";
		switch(food) {
		case "짜장면":
			System.out.println("중국 식당 메뉴임");
			break;
		default:
			System.out.println("중식 아님..");
		}
		if (food == "짜장면") {
			System.out.println("if 중식");
		}
		
		String food2 = new String("짜장면");
		
		if (food2 == "짜장면") {
			System.out.println("if2 중식");
		} // 문자열 비교할 때는 ==을 사용하는 게 아닌 equals를 사용해야 한다. 그래서 문자열 비교할 때는 case를 쓰는게 낫다.
		
		if (food2.equals("짜장면")) {
			System.out.println("if3 중식");
		}
		
	}

}
