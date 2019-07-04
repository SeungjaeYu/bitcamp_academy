package ex01;

public class workshop01 {

	public static void main(String[] args) {
		
		/*
		 * 문2)
		 * 
		 */
//		int num= 456;
//		int result = num / 100 * 100;
//		System.out.println(result);

		/*
		 * 문3)
		 */
		int fahrenheit = 100;
		float celcius = (float)5 / 9 * (fahrenheit - 32);
		System.out.println("Fahrenheit: " + fahrenheit) ;
		System.out.println("Celcius: " + celcius);
		
		/*
		 * 문4)
		 * 
		 */
		byte a = 10;
		byte b = 20;
		byte c = 30;
		char ch = 'A';
		ch = 'C';
		float f = 1.5f;
		long l = 27000000000l;
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = (float)d != 0;
		
		System.out.println("c=" + c);
		System.out.println("ch=" + ch);
		System.out.println("f=" + f);
		System.out.println("l=" +l);
		System.out.println("result=" + result);
		
	}

}
