/**
 *
 *	아래의 데이터를 각각 변수에 담고 화면에 출력하는 프로그램을 작성한다.
 *	홍길동 - name 변수
 *	IT개발자 - job 변수
 *	25 - age 변수
 *	3300 - salary 변수
 *
 *	출력시 아래와 같이 출력된다.
 *
 *	출력결과 >
 *
 *	이름 : "홍길동"
 *	직업 : "IT개발자"
 *  나이 : 25세
 *  연봉 : 3300만원
 */

package ch01_basic.exam;


public class Quiz05 {
	public static void main(String[] args) {
		String name = "\"홍길동\"";
		String job = "\"IT개발자\"";
		int age = 25;
		int salary = 3300;
		
		//System.out.println("이름 : \"홍길동\"\n직업 : \"IT개발자\"\n나이 : 25세 \n연봉 : 3300만원");
		//System.out.printf("이름 : %s\n직업 : %s\n나이 : %d세\n연봉 : %d만원",name,job,age,salary);
		/*
		System.out.println("이름 : " + name);
		System.out.println("직업 : " + job);
		System.out.println("나이 : " + age + "세");
		System.out.println("연봉 : " + salary + "만원");
		*/
		System.out.println("이름 : " + name + "\n직업 : " + job + "\n나이 : "+ age + "세" +"\n연봉 : " +salary + "만원" );
	}	
}
