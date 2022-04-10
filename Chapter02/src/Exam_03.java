/*
 * Boxing, Unboxing
 * Boxing(박싱)은 원시 타입을 참조 타입으로 변환 시키는 것을 말하고, Unboxing(언박싱)은 참조 타입을 원시 타입으로 변환 시키는 것을 말한다.
 * 
 * 특징
 * 1. 원시타입은 null을 담을 수 없지만, 참조 타입은 가능하다.
 * 2. 제너릭 타입에서 사용 가능
 * 
 * Auto Boxing / Unboxing
 * 자동변환
 * 
 * */
public class Exam_03 {
	public static void main(String[] arg) {
		int a = 1;
		Integer b = 1;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b);
		// System.out.println(a instanceof int);
		System.out.println(b instanceof Integer);
		
		// int c = null;
		Integer d = null;
		System.out.println(d);
		
		int e = 2;
		Integer f = e;
		
		System.out.println(f);
		System.out.println(f instanceof Integer);
		
	}
}
