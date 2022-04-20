/*
 * 필드와 메서드의 상속
 * 	1) 필드의 상속자 접근자 : protected
 * 	2) super와 this 예약어를 통한 접근 : 생략시 자동 this로 인식
 * 	3) 메서드의 상속과 메서드 재정의
 * 		- 메서드 오버라이딩 : 접근자와 예외전가
 *        부모 객체가 가지고 있는 메서드를 자식 객체가 그이름 그대로 가져다 사용하는 것
 *        단, 부모메서드의 접근 제한자 보다 크거나 같아야 한다.
 *        부모가 예외 문구를 가지고 있다해도 자식은 예외문구 필수는 아님
 *        자식 메서드에 예외 문구가 있다면 부모 메서드는 반드시 예외문구를 가지고 있어야 한다.
 *        private < protected < public
 * 		- 메서드 오버로딩 : 매개변수의 개수와 자료형
 * 		- final 메서드의 제약
 * 

 * 
 * */
interface InterfaceA {
	// 자바 8에서 지원 인터페이스가 default키워드로 선언되면 메소드가 구현될 수 있다. 
	default void show() {
		// 구현부..
	};
	
	void show2();
}

abstract class AbstractClassA {
	abstract protected void display();
}

class ClassA extends AbstractClassA implements InterfaceA {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	/*
	@Override
	private void display() {

	}
	*/

	@Override
	public void show2() {
		// TODO Auto-generated method stub
		
	}

	/*
	@Override
	private void show2() {
		// TODO Auto-generated method stub
		
	}
	*/
}

public class Exam_15 {

}
