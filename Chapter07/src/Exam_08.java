/*
 * 상수필드와 변수를 위한 final
 * 1. final 필드 : 상수 값을 지정하기 위한 공간으로 값이 변경되지 않는다.
 *   - 지역변수나 멤버 필드 모두 가능하다.
 *   - 리터럴 상수의 경우 대문자로 쓴다!
 *                              
 * 2. final 메서드 : 상속시 오버라이딩(재정의) 되지 않아야 할 메서드에 저장하는 예약어
 * 
 * <변수명의 표기법>
 * 스네이크 케이스(snake case)
 * => 언더바(_) 가 들어 있는 표현 방식을 뱀처럼 생겼다고 하여 스네이크 케이스라고 한다.
 * int snake_case;
 * 
 * 카멜 케이스(camel case)
 * => 중간 글자들은 대문자로 시작하지만 첫 글자가 소문자인 경우에는 낙타와 모양이 비슷하다 하여 카멜 케이스라고 한다.
 * String camelCase;
 * 
 * 파스칼 케이스(pascal case)
 * => 첫 글자와 중간 글자들이 대문자인 경우 파스칼 언어의 표기법과 유사하다고 하여 파스칼 케이스라고 한다.
 * float PascalCase;
 * 
 */

class Circle {
	public final double PI = 3.141592;

	public double getPI() {
		return PI;
	}
	
}

public class Exam_08 {
	public static void main(String[] args){
		Circle c = new Circle();
		System.out.println("pi = " + c.getPI());
		//c.PI = 1.14;
		final int x = 100;
		System.out.println("x = " + x);
		System.out.println("x = " + x);
	}
}
