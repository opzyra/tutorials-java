/*
 * 변수
 * 자료형 변수이름 = 값;
 * 
 * 자료형
 * 자바의 8대 기본 자료형
 * 원시타입 (Primitive type)
 * boolean true / false 1byte
 * char 문자형 unsigned 2byte
 * byte 정수 -128 ~ 127 1byte
 * short 정수 -32768 ~ 32767 2byte
 * int 정수 -2147483648 ~ 2147483647( -21억 ~ + 21억) 4byte
 * long 정수 8byte
 * float 실수 4byte
 * double(기본 타입) 실수 8byte
 * 
 * 
 * 참조타입 (Reference Type)
 * 원시 타입을 제외한 타입들(문자열, 배열, 열거, 클래스, 인터페이스)
 * 
 * */
public class Exam_01 {

	public static void main(String[] arg) {
		//byte a = 1;
		byte a;
		a = 1;
		
		boolean b = false ; //true
		byte c = 127; // -128 ~ 127
		short d = 32767; // -32768 ~ 32767
		int e = 100;
		long f = 100L;
		
		float g = 3.14f; //
		double h = 3.14;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " +d);
		System.out.println("e = " + e);
		System.out.println("f = " + f);
		System.out.println("g = " + g);
		System.out.println("h = " + h);
	}
	
}
